package org.createdtolearn.booksearch;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by blu on 10/27/15.
 */
public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Context context, ArrayList<Book> aBooks) {
        super(context, 0, aBooks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO: Complete the definition of the view for each book
        return null;
    }
}