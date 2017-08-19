package sample.app.ui.top

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sample.app.R





class TopFragment : Fragment() {
    companion object {
        fun newInstance(position : Int): TopFragment {
            val fragment = TopFragment()
            val bundle = Bundle()
            bundle.putInt("position", position)
            fragment.arguments = bundle
            return fragment
        }
    }

    lateinit var recyclerView : RecyclerView
    lateinit var adapter : TopAdapter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater!!.inflate(R.layout.fragment_top, container, false)

        recyclerView = view.findViewById(R.id.top_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle : Bundle = arguments
        val position : Int = bundle.getInt("position")
        val title : ArrayList<String> = ArrayList()
        val img : ArrayList<Int> = ArrayList()

        when(position) {
            0 -> {
                title.add("宇宙兄弟")
                title.add("エリアの騎士")
                title.add("キングダム")
                title.add("Days")
                title.add("Bule Giant")
                img.add(R.drawable.utyu_kyoudai)
                img.add(R.drawable.aria_no_kishi)
                img.add(R.drawable.kingdom)
                img.add(R.drawable.days)
                img.add(R.drawable.bule_giant)
            }
            1 -> {
                title.add("Splatoon")
                title.add("ゼルダの伝説")
                title.add("マリオカート")
                title.add("PUBG")
                title.add("モンスターハンター　ワールド")
                img.add(R.drawable.splatoon)
                img.add(R.drawable.zelda)
                img.add(R.drawable.mario_kart)
                img.add(R.drawable.pubg)
                img.add(R.drawable.monhun)
            }
            2 -> {
                title.add("メッシ")
                title.add("ネイマール")
                title.add("岡崎慎司")
                title.add("本田圭佑")
                img.add(R.drawable.messi)
                img.add(R.drawable.neymar)
                img.add(R.drawable.okazaki)
                img.add(R.drawable.honda)
            }
        }

        adapter = TopAdapter(img, title)
        recyclerView.adapter = adapter

        val dividerItemDecoration = DividerItemDecoration(recyclerView.context, LinearLayoutManager(activity).orientation)
        recyclerView.addItemDecoration(dividerItemDecoration)

    }
}