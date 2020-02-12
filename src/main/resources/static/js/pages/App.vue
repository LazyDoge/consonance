<template>
    <disciplines :disciplines="disciplines"></disciplines>
</template>

<script>
    import Disciplines from "../components/admin/Disciplines.vue";
    export default {
        name: "App",
        components: {Disciplines},
        data(){
            return {
                disciplines: disciplines
            }
        }
    }
</script>

<style scoped>

</style>