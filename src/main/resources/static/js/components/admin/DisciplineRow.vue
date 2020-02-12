<template>
    <v-card class="my-2">
        <v-card-text primary-title>
            <span>{{discipline.id}} {{discipline.name}} {{discipline.costPerHour}}</span>
        </v-card-text>
    </v-card>
</template>

<script>
    export default {
        name: "DisciplineRow",
        props: ["discipline", "disciplines"]
    }
</script>

<style scoped>

</style>