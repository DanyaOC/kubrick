package edu.itesm.stanley

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_actorsk.*

class ActorskFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_actorsk, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        actors_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = ActorsAdapter(createData())
        }
    }

    fun createData(): ArrayList<Actor>{
        val actors = ArrayList<Actor>()
        actors.add(Actor(R.drawable.silvera,"Frank Silvera", "1914-1970","Frank Alvin Silvera was a Jamaican-born American character actor and theatrical director. He starred in Kubrick's Fear and Desire(1953) and Killer's Kiss (1955)."))
        actors.add(Actor(R.drawable.sobotka,"Ruth Sobotka", "1925-1967","Ruth A. Sobotka was an Austrian-born American dancer, costume designer, art director, painter, and actress. She starred in Kubrick's Killer's Kiss (1955) and The Killing (1956)."))
        actors.add(Actor(R.drawable.turkel,"Joe Turkel", "1927-present","Joe Turkel is an American character actor. He starred in Kubrick's The Killing (1956), Paths of Glory (1957) and The Shining (1980)."))
        actors.add(Actor(R.drawable.carey,"Timothy Carey", "","Timothy Carey was an American film and television character actor. Carey was best known for portraying manic or violent characters who are driven to extremes. He starred in Kubrick's The Killing (1956) and Paths of Glory (1957)."))
        actors.add(Actor(R.drawable.hayden,"Sterling Hayden", "","Sterling Hayden was an American actor, author, sailor and decorated Marine Corps officer and OSS agent (from services during World War II). He starred in Kubrick's The Killing (1956) and Dr Strangelove (1964)."))
        actors.add(Actor(R.drawable.douglas,"Kirk Douglas", "","Kirk Douglas was an American actor, producer, director, philanthropist, and writer. After an impoverished childhood with immigrant parents and six sisters. He starred in Kubrick's Paths of Glory (1957) and Spartacus (1960)."))
        actors.add(Actor(R.drawable.christiane,"Christiane Kubrick", "","is a German actress, dancer, painter, singer and was the wife of filmmaker Stanley Kubrick. She starred in his Paths of Glory (1957) and Eyes Wide Shut (1999)."))
        actors.add(Actor(R.drawable.sellers,"Peter Sellers", "","Peter Sellers was an English film actor, comedian and singer. Sellers began his film career during the 1950s. He starred in Kubrick's Lolita (1962) and Dr Strangelove (1964)."))
        actors.add(Actor(R.drawable.rossiter,"Leonard Rossiter", "1926-1984","Leonard Rossiter was an English actor. He had a long career in the theatre but achieved his greatest fame for his television comedy roles. He starred un Kubrick's 2001: A Space Odyssey(1968) and Barry Lyndon (1975)."))
        actors.add(Actor(R.drawable.tyzack,"Margaret Tyzack", "1931-2011","Margaret Tyzack was an English actress. She starred in Kubrick's  2001: A Space Odyssey (1968) and A Clockwork Orange (1971)."))
        actors.add(Actor(R.drawable.vivian,"Vivian Kubrick", "1960-present","Vivian Kubrick is an American-British filmmaker and composer. She is the daughter of filmmaker Stanley Kubrick. She had small cameos in Kubrick's 2001: A Space Odyssey (1968), Barry Lyndon (1975), The Shining (1980) and Full Metal Jacket (1987)."))
        actors.add(Actor(R.drawable.berkoff,"Steven Berkoff", "1937-present","Steven Berkoff is a British actor, author, playwright, theatre practitioner, and theatre director. As a film actor, he is best known for his performances in villainous roles. He starred in Kubrick's A Clockwork Orange (1971) and Barry Lyndon (1975)."))
        actors.add(Actor(R.drawable.sharp,"Anthony Sharp", "1915-1984","Anthony Sharp was an English actor, writer and director. He starred in Kubrick's A Clockwork Orange (1971) and Barry Lyndon (1975)."))
        actors.add(Actor(R.drawable.magee,"Patrick Magee", "1922-1982"," was a Northern Irish actor and director of stage and screen. He was known for his collaborations with Samuel Beckett and Harold Pinter. He starred in Kubrick's A Clockwork Orange (1971) and Barry Lyndon (1975)."))
        actors.add(Actor(R.drawable.stone,"Philip Stone", "1924-2003","Philip Stone was an English actor,[1] well known for portraying film characters such as \"Pa\", the father of Alex DeLarge, in A Clockwork Orange; General Alfred Jodl in Hitler: The Last Ten Days; Delbert Grady in The Shining; and Captain Phillip Blumburtt in Indiana Jones and the Temple of Doom."))
        actors.add(Actor(R.drawable.quigley,"Godfrey Quigley", "1923-1994","was an Irish film, television and stage actor. He appeared in Stanley Kubrick's films A Clockwork Orange (1971) and Barry Lyndon (1975)."))
        actors.add(Actor(R.drawable.vitali,"Leon Vitali", "1948-present","Leon Vitali is an English actor, best known for his collaborations with film director Stanley Kubrick as his personal assistant, and as an actor, most notably as Lord Bullingdon in Barry Lyndon (1975) He also starred in Eyes Wide Shut (1999).."))
        actors.add(Actor(R.drawable.bishop,"Ed Bishop", "1932-2005","Ed Bishop was an American actor, based in the UK. He starred in Kubrick's Lolita (1962) and 2001: A Space Odyssey (1968)."))

        return actors
    }
}