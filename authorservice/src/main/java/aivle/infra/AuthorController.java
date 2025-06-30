package aivle.infra;

import aivle.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/authors")
@Transactional
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    @RequestMapping(
        value = "/authors/{id}/approveauthor",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Author approveAuthor(
        @PathVariable(value = "id") Long id,
        @RequestBody ApproveAuthorCommand approveAuthorCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /author/approveAuthor  called #####");
        Optional<Author> optionalAuthor = authorRepository.findById(id);

        optionalAuthor.orElseThrow(() -> new Exception("No Entity Found"));
        Author author = optionalAuthor.get();
        author.approveAuthor(approveAuthorCommand);

        authorRepository.save(author);
        return author;
    }

    @RequestMapping(
        value = "/authors/{id}/disapproveauthor",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Author disapproveAuthor(
        @PathVariable(value = "id") Long id,
        @RequestBody DisapproveAuthorCommand disapproveAuthorCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /author/disapproveAuthor  called #####");
        Optional<Author> optionalAuthor = authorRepository.findById(id);

        optionalAuthor.orElseThrow(() -> new Exception("No Entity Found"));
        Author author = optionalAuthor.get();
        author.disapproveAuthor(disapproveAuthorCommand);

        authorRepository.save(author);
        return author;
    }
}
//>>> Clean Arch / Inbound Adaptor
