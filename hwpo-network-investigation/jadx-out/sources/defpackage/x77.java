package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x77 implements j {
    public w77 t;
    public boolean u;
    public int v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0280a();
        public int t;
        public et7 u;

        /* JADX INFO: renamed from: x77$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class C0280a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                a aVar = new a();
                aVar.t = parcel.readInt();
                aVar.u = (et7) parcel.readParcelable(a.class.getClassLoader());
                return aVar;
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.t);
            parcel.writeParcelable(this.u, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z) {
        u77 u77Var;
        qc0 qc0Var;
        if (this.u) {
            return;
        }
        w77 w77Var = this.t;
        if (z) {
            w77Var.a();
            return;
        }
        u77 u77Var2 = w77Var.i0;
        if (u77Var2 == null || w77Var.z == null) {
            return;
        }
        w77Var.h0.u = true;
        u77Var2.b();
        w77Var.h0.u = false;
        if (w77Var.z != null && (u77Var = w77Var.i0) != null && u77Var.b.size() == w77Var.z.length) {
            for (int i = 0; i < w77Var.z.length; i++) {
                if (!(w77Var.i0.a(i) instanceof w33) || (w77Var.z[i] instanceof p77)) {
                    boolean z2 = w77Var.i0.a(i).hasSubMenu() && !(w77Var.z[i] instanceof y77);
                    boolean z3 = (w77Var.i0.a(i).hasSubMenu() || (w77Var.z[i] instanceof r77)) ? false : true;
                    if ((w77Var.i0.a(i) instanceof w33) || (!z2 && !z3)) {
                    }
                }
            }
            int i2 = w77Var.A;
            int size = w77Var.i0.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItem menuItemA = w77Var.i0.a(i3);
                if (menuItemA.isChecked()) {
                    w77Var.setCheckedItem(menuItemA);
                    w77Var.A = menuItemA.getItemId();
                    w77Var.B = i3;
                }
            }
            if (i2 != w77Var.A && (qc0Var = w77Var.t) != null) {
                qwa.a(w77Var, qc0Var);
            }
            int i4 = w77Var.x;
            boolean z4 = i4 != -1 ? i4 == 0 : w77Var.getCurrentVisibleContentItemCount() > 3;
            for (int i5 = 0; i5 < size; i5++) {
                w77Var.h0.u = true;
                w77Var.z[i5].setExpanded(w77Var.n0);
                v77 v77Var = w77Var.z[i5];
                if (v77Var instanceof r77) {
                    r77 r77Var = (r77) v77Var;
                    r77Var.setLabelVisibilityMode(w77Var.x);
                    r77Var.setItemIconGravity(w77Var.y);
                    r77Var.setItemGravity(w77Var.d0);
                    r77Var.setShifting(z4);
                }
                if (w77Var.i0.a(i5) instanceof h) {
                    w77Var.z[i5].c((h) w77Var.i0.a(i5));
                }
                w77Var.h0.u = false;
            }
            return;
        }
        w77Var.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.v;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, f fVar) {
        this.t.b(fVar);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
        if (parcelable instanceof a) {
            w77 w77Var = this.t;
            a aVar = (a) parcelable;
            int i = aVar.t;
            int size = w77Var.i0.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem menuItemA = w77Var.i0.a(i2);
                if (i == menuItemA.getItemId()) {
                    w77Var.A = i;
                    w77Var.B = i2;
                    w77Var.setCheckedItem(menuItemA);
                    break;
                }
            }
            Context context = this.t.getContext();
            et7 et7Var = aVar.u;
            SparseArray sparseArray = new SparseArray(et7Var.size());
            for (int i3 = 0; i3 < et7Var.size(); i3++) {
                int iKeyAt = et7Var.keyAt(i3);
                zi0.a aVar2 = (zi0.a) et7Var.valueAt(i3);
                sparseArray.put(iKeyAt, aVar2 != null ? new ti0(context, aVar2) : null);
            }
            w77 w77Var2 = this.t;
            SparseArray<ti0> sparseArray2 = w77Var2.O;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int iKeyAt2 = sparseArray.keyAt(i4);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (ti0) sparseArray.get(iKeyAt2));
                }
            }
            v77[] v77VarArr = w77Var2.z;
            if (v77VarArr != null) {
                for (v77 v77Var : v77VarArr) {
                    if (v77Var instanceof r77) {
                        r77 r77Var = (r77) v77Var;
                        ti0 ti0Var = sparseArray2.get(r77Var.getId());
                        if (ti0Var != null) {
                            r77Var.setBadge(ti0Var);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        a aVar = new a();
        aVar.t = this.t.getSelectedItemId();
        SparseArray<ti0> badgeDrawables = this.t.getBadgeDrawables();
        et7 et7Var = new et7();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            ti0 ti0VarValueAt = badgeDrawables.valueAt(i);
            et7Var.put(iKeyAt, ti0VarValueAt != null ? ti0VarValueAt.x.a : null);
        }
        aVar.u = et7Var;
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z) {
    }
}
