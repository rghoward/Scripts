package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.hwpo_training_app.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements j, AdapterView.OnItemClickListener {
    public Context t;
    public LayoutInflater u;
    public f v;
    public ExpandedMenuView w;
    public j.a x;
    public a y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends BaseAdapter {
        public int t = -1;

        public a() {
            b();
        }

        public final void b() {
            f fVar = d.this.v;
            h hVar = fVar.v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == hVar) {
                        this.t = i;
                        return;
                    }
                }
            }
            this.t = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h getItem(int i) {
            d dVar = d.this;
            f fVar = dVar.v;
            fVar.i();
            ArrayList<h> arrayList = fVar.j;
            dVar.getClass();
            int i2 = this.t;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return arrayList.get(i);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            d dVar = d.this;
            f fVar = dVar.v;
            fVar.i();
            int size = fVar.j.size();
            dVar.getClass();
            return this.t < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.u.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).c(getItem(i));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context) {
        this.t = context;
        this.u = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z) {
        j.a aVar = this.x;
        if (aVar != null) {
            aVar.c(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z) {
        a aVar = this.y;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        throw null;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, f fVar) {
        if (this.t != null) {
            this.t = context;
            if (this.u == null) {
                this.u = LayoutInflater.from(context);
            }
        }
        this.v = fVar;
        a aVar = this.y;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.w.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        boolean zHasVisibleItems = mVar.hasVisibleItems();
        Context context = mVar.a;
        if (!zHasVisibleItems) {
            return false;
        }
        g gVar = new g();
        gVar.t = mVar;
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
        d dVar = new d(aVar.getContext());
        gVar.v = dVar;
        dVar.x = gVar;
        mVar.b(dVar, context);
        d dVar2 = gVar.v;
        if (dVar2.y == null) {
            dVar2.y = dVar2.new a();
        }
        aVar.setAdapter(dVar2.y, gVar);
        View view = mVar.o;
        if (view != null) {
            aVar.setCustomTitle(view);
        } else {
            aVar.setIcon(mVar.n).setTitle(mVar.m);
        }
        aVar.setOnKeyListener(gVar);
        androidx.appcompat.app.e eVarCreate = aVar.create();
        gVar.u = eVarCreate;
        eVarCreate.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.u.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.u.show();
        j.a aVar2 = this.x;
        if (aVar2 == null) {
            return true;
        }
        aVar2.d(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        if (this.w == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.w;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(h hVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.v.q(this.y.getItem(i), this, 0);
    }
}
