package ru.flippy.lineageview;
import android.graphics.Color;
import android.support.v7.widget.*;
import android.widget.*;
import android.view.*;

public class LineageAdapter extends RecyclerView.Adapter<LineageAdapter.AdapterHolder> {


	@Override
	public void onAttachedToRecyclerView(RecyclerView recyclerView) {
		super.onAttachedToRecyclerView(recyclerView);
	}

	@Override
	public AdapterHolder onCreateViewHolder(ViewGroup viewGroup, int p2) {
		View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lineage_item, viewGroup, false);
		AdapterHolder pvh = new AdapterHolder(v);
		return pvh;
	}



	@Override
	public void onBindViewHolder(final AdapterHolder holder, int position) {
		holder.bind(position);

		holder.itemView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				//holder.itemView.setPadding(25,25,25,25);
				holder.itemView.setBackgroundColor(Color.RED);
			}
		});
	}


	@Override
	public int getItemCount() {
		return 200;
	}


	public class AdapterHolder extends RecyclerView.ViewHolder {

		public TextView number;

		AdapterHolder(View itemView) {
			super(itemView);
			number = (TextView) itemView.findViewById(R.id.number);
		}


		void bind(int position) {
			float value = (position + 1) / 2f;
			String str = Float.toString(value);
			number.setText(str);
		}


	}

}