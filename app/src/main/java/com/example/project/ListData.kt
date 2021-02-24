package com.example.project

class ListData {
        companion object {
            fun <ArrayList> getListViewModelList(): ArrayList {
                val listViewModelArrayList = ArrayList<ListViewModel>()
                listViewModelArrayList.add(ListViewModel(1, "Donuts", R.drawable.one, " This simple homemade donut dough is made with flour, milk, yeast, and sugar, then the donuts are fried and dredged in sugar. This recipe is easy to make and produces a very indulgent little treat! Make it once and you’ll never use a different recipe for donuts. It’s soo good!"))
                listViewModelArrayList.add(ListViewModel(2, "Ice Cream", R.drawable.two, "While ice cream is a staple in our freezer year round, the add-in potentials for this particular ice cream are endless. I’ve filled this ice cream with chunks of brownies, bits of cookie dough, pieces of oatmeal cookies, and swirls of salted caramel sauce."))
                listViewModelArrayList.add(ListViewModel(3, "Macarons", R.drawable.three, "It’s never a bad time for dessert. Cookies, cake, pie, you name it! But sometimes you need to change it up with something a little fancier: enter macarons. They may seem intimidating but with our easy-to-follow guide, they don’t have to be. And you can customize them! Want a variety?"))
                listViewModelArrayList.add(ListViewModel(4, "Marshmallow", R.drawable.four, "Well, as cliche as this sounds, they really are SO MUCH better than any store-bought marshmallows. Store-bought marshmallows just don’t have that pure, irresistible, marshmallow flavor or the melt-in-your-mouth fluffiness. And if you try making s’mores, you’ll find that homemade marshmallows have a really desirable melting quality that store-bought marshmallows don’t have."))
                listViewModelArrayList.add(ListViewModel(5, "Candy", R.drawable.five, "Is there anything better than eating handfuls of candy until you teeter on the edge of sheer bliss and belly-aching agony? We say no. There's only one way to make this time-honored pastime better, and that's indulging in homemade candy."))
                listViewModelArrayList.add(ListViewModel(6, "Cake", R.drawable.six,"This cake was sent home from our children's school. It is the simplest, great tasting cake I've ever made. Great to make with the kids, especially for cupcakes." ))
                listViewModelArrayList.add(ListViewModel(7, "Cupcake", R.drawable.seven,"These super moist chocolate cupcakes pack TONS of chocolate flavor in each cupcake wrapper! Made from simple everyday ingredients, this easy cupcake recipe will be your new favorite. For best results, use natural cocoa powder and buttermilk. These chocolate cupcakes taste completely over-the-top with chocolate buttercream!" ))
                listViewModelArrayList.add(ListViewModel(8, "Cheesecake", R.drawable.eight, "As much as I love cheesecake, I’ve never published a classic cheesecake recipe. There’s always been peanut butter, sprinkles, blueberry swirls, Snickers cheesecake, pumpkin, lemon, red velvet, or Nutella. That’s a lot of cheesecake recipes without a single nod to where it all originates: classic cheesecake."))
                return listViewModelArrayList as ArrayList
            }
        }
}