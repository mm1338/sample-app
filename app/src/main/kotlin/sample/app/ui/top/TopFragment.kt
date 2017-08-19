package sample.app.ui.top

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sample.app.R

class TopFragment : Fragment() {
    lateinit var recyclerView : RecyclerView
    lateinit var adapter : TopAdapter
    lateinit var layoutManager : RecyclerView.LayoutManager

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater!!.inflate(R.layout.fragment_top, container, false)

        recyclerView = view.findViewById(R.id.top_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val title : ArrayList<String> = ArrayList()
        title.add("宇宙へ")
        title.add("宇宙兄弟、南波六太　宇宙へ")
        title.add("宇宙兄弟、南波日々人　帰還")

        val img : ArrayList<Int> = ArrayList()
        img.add(R.drawable.taihu)
        img.add(R.drawable.mutta)
        img.add(R.drawable.hibito)

        adapter = TopAdapter(img, title)
        recyclerView.adapter = adapter

    }
}