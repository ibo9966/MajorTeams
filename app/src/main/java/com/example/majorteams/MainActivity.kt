package com.example.majorteams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var parentList=ArrayList<ParentItem>()





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView =findViewById(R.id.parentRecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this)

        addDataToList()
        val adapter = ParentAdapter(parentList)
        recyclerView.adapter=adapter



    }
    private fun addDataToList(){

        val childItems1 = ArrayList<ChildItem>()
        childItems1.add(ChildItem("Beşiktaş",R.drawable.besiktas))
        childItems1.add(ChildItem("Fenerbahçe",R.drawable.fener))
        childItems1.add(ChildItem("Galatasaray",R.drawable.gs))
        childItems1.add(ChildItem("Trabzonspor",R.drawable.trabzonspor))

        parentList.add(ParentItem("Türk Ligi", R.drawable.turkiye, childItems1))

        val childItems2 = ArrayList<ChildItem>()
        childItems2.add(ChildItem("Arsenal",R.drawable.arsenal))
        childItems2.add(ChildItem("Chelsea",R.drawable.chelsea))
        childItems2.add(ChildItem("Liverpool",R.drawable.liverpool))
        childItems2.add(ChildItem("Manchester United",R.drawable.manu))
        childItems2.add(ChildItem("Manchester City",R.drawable.mcity))
        childItems2.add(ChildItem("Tottenham",R.drawable.tottenham))
        childItems2.add(ChildItem("Fulham",R.drawable.fulham))

        parentList.add(ParentItem("İngiltere Ligi", R.drawable.ingiletere, childItems2))

        val childItems3 = ArrayList<ChildItem>()
        childItems3.add(ChildItem("Bayern Munich",R.drawable.bayern))
        childItems3.add(ChildItem("Dortmunb",R.drawable.dortmund))
        childItems3.add(ChildItem("Leipzing",R.drawable.leipzig))
        childItems3.add(ChildItem("Stutgart",R.drawable.stutgart))

        parentList.add(ParentItem("Almanya Ligi", R.drawable.almanya, childItems3))

        val childItems4 = ArrayList<ChildItem>()
        childItems4.add(ChildItem("Paris Saint Germain ",R.drawable.psg))
        childItems4.add(ChildItem("Marsilya",R.drawable.marsilya))
        childItems4.add(ChildItem("Monaco",R.drawable.monaco))
        childItems4.add(ChildItem("Lens",R.drawable.lens))

        parentList.add(ParentItem("Fransa Ligi", R.drawable.fransa, childItems4))

        val childItems5 = ArrayList<ChildItem>()
        childItems5.add(ChildItem("Atalanta",R.drawable.atalanta))
        childItems5.add(ChildItem("İnter",R.drawable.inter))
        childItems5.add(ChildItem("Milan",R.drawable.milan))
        childItems5.add(ChildItem("Juventus",R.drawable.juventus))
        childItems5.add(ChildItem("Napoli",R.drawable.napoli))
        childItems5.add(ChildItem("Lazio",R.drawable.lazio))
        childItems5.add(ChildItem("Roma",R.drawable.roma))

        parentList.add(ParentItem("İtalya Ligi", R.drawable.italya, childItems5))
    }
}