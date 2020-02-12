<template>
    <v-layout row>
        <v-text-field
                class="mx-5"
                label="Name"
                v-model="name"/>
        <v-text-field
                class="mx-5"
                label="Cost"
                v-model="costPerHour"/>
        <v-btn @click="save">Add</v-btn>
    </v-layout>
</template>

<script>

    export default {
        name: "DisciplineForm",
        props: ["disciplines"],
        data() {
            return {
                id: '',
                name: '',
                costPerHour: ''
            }
        },
        methods: {
            save() {
                const discipline = {name: this.name, costPerHour: this.costPerHour};
                debugger

                this.$resource('/rest/admin/disciplines{/id}').save({}, discipline)
                    .then(result =>
                        result.json()
                        .then(data => {
                            this.disciplines.push(data);
                            this.name = '';
                            this.costPerHour = ''
                        }));
            }
        }
    }
</script>

<style scoped>

</style>