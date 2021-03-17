package edu.itesm.stanley

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class ActorsAdapter(private val actors : List<Actor>)
    : RecyclerView.Adapter<ActorsAdapter.ActorViewHolder>(){

    inner class ActorViewHolder(renglon_actors: View) : RecyclerView.ViewHolder(renglon_actors){
        var nombre = renglon_actors.findViewById<TextView>(R.id.nombre)
        var edad = renglon_actors.findViewById<TextView>(R.id.edad)
        var descripcion = renglon_actors.findViewById<TextView>(R.id.descripcion)
        var imagen = renglon_actors.findViewById<ImageView>(R.id.imagen)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.actors_renglon,parent, false)
        return ActorViewHolder(renglon_vista)
    }

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        val actor= actors[position]
        holder.imagen.setImageResource(actor.imagen)
        holder.nombre.text = actor.nombre
        holder.edad.text = actor.edad
        holder.descripcion.text = actor.descripcion
        holder.itemView.setOnClickListener {
            val action = ActorskFragmentDirections.actionActorskFragmentToActorFragment(actor)
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return actors.size
    }
}


