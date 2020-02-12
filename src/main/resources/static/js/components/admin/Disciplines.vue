<template>
    <v-layout align-space-around justify-start column>
        <discipline-form :disciplines="disciplines"/>
        <discipline-row v-for="discipline in disciplines"
                        :key="discipline.id"
                        :discipline="discipline"
                        :disciplines="disciplines"
        />
    </v-layout>
</template>

<script>
    import DisciplineForm from "./DisciplineForm.vue";
    import DisciplineRow from "./DisciplineRow.vue";

    export default {
        name: "Disciplines",
        props: ["disciplines"],
        components: {DisciplineRow, DisciplineForm}
    }
</script>

<style scoped>

</style>