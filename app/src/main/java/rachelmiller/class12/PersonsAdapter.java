package rachelmiller.class12;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by rachelmiller on 4/10/17.
 */

public class PersonsAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    private List<Person> persons;
    private Context context;

    public PersonsAdapter(List<Person> persons, Context context) {
        this.persons = persons;
        this.context = context;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_person, parent, false);
        return new PersonViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        Person person = persons.get(position);
        holder.bind(person);
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }
}



