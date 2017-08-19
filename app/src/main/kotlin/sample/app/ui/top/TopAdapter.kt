package sample.app.ui.top

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import butterknife.bindView
import sample.app.R


class TopAdapter(itemImage : ArrayList<Int>, itemTitle : ArrayList<String>) : RecyclerView.Adapter<TopAdapter.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemImg : ImageView by bindView<ImageView>(R.id.item_img)
        val itemTitle : TextView by bindView<TextView>(R.id.item_title)
    }

    val images = itemImage
    val text = itemTitle

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view : View = LayoutInflater.from(parent!!.context).inflate(R.layout.layout_news_list_item, parent, false)
        val viewHolder = ViewHolder(view)
        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.itemTitle.text = text[position]
        holder!!.itemImg.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return text.size
    }
}
