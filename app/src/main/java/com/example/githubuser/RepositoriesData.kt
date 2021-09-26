package com.example.githubuser

object RepositoriesData {
    val listData: ArrayList<Repository>
        get() {
            val list = arrayListOf<Repository>()
            val chosenTitle =RepositoriesData.titles[pos]
            val chosenDesc = RepositoriesData.descs[pos]

            for (i in chosenDesc.indices){
                val repo = Repository()
                repo.title = chosenTitle[i]
                repo.description = chosenDesc[i]
                list.add(repo)
            }
            return list
        }

    var pos : Int= 0

    private val titles:ArrayList<ArrayList<String>> = arrayListOf(
        arrayListOf("rust_os"),
        arrayListOf("stb"),
        arrayListOf("myunix","toarus"),
        arrayListOf("PetrixOS","COVID-CT"),
        arrayListOf("stevienix"),
        arrayListOf("OSdev"),
        arrayListOf("gcc","codespan"),
        arrayListOf("bootloader"),
        arrayListOf("speech-synthesis-paper"),
        arrayListOf("cortex-a"),
        arrayListOf("rusty-editor")
    )

    private val descs:ArrayList<ArrayList<String>> = arrayListOf(
        arrayListOf("operating system microkernel written in Rust"),
        arrayListOf("stb single-file public domain libraries for C/C++"),
        arrayListOf("myunix v2 deprecated in favour of https://gitlab.com/myunix/myunix/ ","A completely-from-scratch hobby operating system: bootloader, kernel, drivers, C library, and userspace including a composited graphical UI, dynamic linker, syntax-highlighting text editor, network stack, etc."),
        arrayListOf("This is hobbyist project. So don't expect first to be finished","COVID-CT-Dataset: A CT Scan Dataset about COVID-19"),
        arrayListOf("stevienix - a hobby unix clone "),
        arrayListOf("Learning OSdev quietly fun"),
        arrayListOf("Forked from gcc-mirror/gcc","Beautiful diagnostic reporting for text-based programming languages."),
        arrayListOf("An experimental pure-Rust x86 bootloader"),
        arrayListOf("List of speech synthesis papers."),
        arrayListOf("Low level access to Cortex-A processors"),
        arrayListOf("Scene editor for rg3d engine")
    )
}