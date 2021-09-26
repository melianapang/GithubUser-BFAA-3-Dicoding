package com.example.githubuser

object UsersData {
    val listData: ArrayList<User>
        get() {
            val list = arrayListOf<User>()

            for (pos in profilepic.indices){
                val user = User()
                user.photo = profilepic[pos]
                user.name = names[pos]
                user.username = usernames[pos]
                user.email = emails[pos]
                user.following = following[pos]
                user.follower = followers[pos]
                user.company = companies[pos]
                user.location = locations[pos]
                user.index = pos

                list.add(user)
            }
            return list
        }

    private val profilepic = arrayListOf(
            R.drawable.user1,
            R.drawable.user2,
            R.drawable.user3,
            R.drawable.user4,
            R.drawable.user5,
            R.drawable.user6,
            R.drawable.user7,
            R.drawable.user8,
            R.drawable.user9,
            R.drawable.user10,
            R.drawable.user11
    )

    private val names = arrayListOf<String>(
            "Tan Song Yun",
            "Taylor Swift",
            "Jack Antonoff",
            "William Bowery",
            "Justin Vernon",
            "Selena Gomez",
            "Shen Yue",
            "Shen Yue",
            "Anneth Welson",
            "Hyun Bin",
            "Song Wei Long",
            "Kim Go Eun"
    )

    private val usernames = arrayListOf<String>(
            "tansongyun_",
            "taylorswift13",
            "jack_antonoff",
            "willbowery",
            "boniver_",
            "selena_gomez",
            "shenyuee",
            "anneth133",
            "hyunbin22",
            "weilong_song",
            "ggoeun_77"
    )

    private val emails = arrayListOf<String>(
        "tan.songyun@gmail.com",
        "taylorswift13@gmail.com",
        "jackantonoff@gmail.com",
        "william_bowery@outlook.com",
        "boniver13@yahoo.com",
        "selenagomez@outlook.com",
        "shenyueee@gmail.com",
        "annethwelsonn@gmail.com",
        "hyunbin133@outlook.com",
        "weilong.song@outlook.com",
        "kim_ggoeun@yahoo.com"
    )

    private val following = arrayListOf(
        21,113,45,98,23,45,68,62,38,11,97
    )

    private val followers = arrayListOf(
        56,131,62,37,89,22,90,61,44,27,88
    )

    private val companies = arrayListOf<String>(
        "Walmart Inc.",
        "China Petroleum & Chemical Corp.",
        "Amazon.com Inc.",
        "PetroChina Co. Ltd. ",
        "Apple Inc.",
        "CVS Health Corp.",
        "Royal Dutch Shell PLC ",
        "Berkshire Hathaway Inc.",
        "Toyota Motor Corp.",
        "Volkswagen AG",
        "ICBC"
    )

    private val locations = arrayListOf<String>(
        "Paris",
        "Jakarta",
        "Surabaya",
        "Taipei",
        "Hualien",
        "Amsterdam",
        "Maldives",
        "Sydney",
        "Brisbane",
        "Wellington",
        "Beijing"
    )
}