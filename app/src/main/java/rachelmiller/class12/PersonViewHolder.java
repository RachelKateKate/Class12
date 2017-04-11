package rachelmiller.class12;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rachelmiller on 4/10/17.
 */
public class PersonViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView personNameView;
    private TextView personInfoView;
    private ImageView personPhotoView;
    private Context context; //context is an activity. Activity inherits from Context

    public PersonViewHolder(View itemView, Context context) { // we take the cardView and break it down
        super(itemView); //itemView is the cardview
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        personNameView = (TextView) itemView.findViewById(R.id.person_name);
        personInfoView = (TextView) itemView.findViewById(R.id.person_info);
        personPhotoView = (ImageView) itemView.findViewById(R.id.person_photo);
        this.context = context;
    }

    // if we wnated to start an ew
    //activity we would say context.startActivity
    // example: public void whatever()
    // { context.startActivity(new Intent());
    // Toast.makeText....

    public void bind(final Person person) { // add final in the () because its needs it to use to do stuff
        //bind is where we switch the information, pics & info
        personNameView.setText(person.name);
        personInfoView.setText(person.info);
        personPhotoView.setImageResource(person.photoId);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person p = person;
                Toast.makeText(context, personNameView.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
