<template>
    <div>
        <String
            label="BookName"
            v-model="value.bookName"
            :editMode="editMode"
        />
        <String
            label="Category"
            v-model="value.category"
            :editMode="editMode"
        />
        <Boolean
            label="IsBestSeller"
            v-model="value.isBestSeller"
            :editMode="editMode"
        />
        <String
            label="AuthorName"
            v-model="value.authorName"
            :editMode="editMode"
        />
        <String
            label="Image"
            v-model="value.image"
            :editMode="editMode"
        />
        <Number
            label="SubscriptionCount"
            v-model="value.subscriptionCount"
            :editMode="editMode"
        />
        <String
            label="BookContent"
            v-model="value.bookContent"
            :editMode="editMode"
        />
        <String
            label="PdfPath"
            v-model="value.pdfPath"
            :editMode="editMode"
        />
        <Number
            label="Price"
            v-model="value.price"
            :editMode="editMode"
        />
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'Book',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "books",
        value: {
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
