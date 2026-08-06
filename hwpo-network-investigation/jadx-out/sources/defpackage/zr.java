package defpackage;

import android.R;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zr implements wca {
    public final View a;
    public final oh4<uaa, uaa> b;
    public final mh4<qq5> c;
    public final w37 d = new w37();
    public final jv9 e = new jv9(new o7(1, this));
    public final qr f = new qr(0, this);
    public final rr g = new rr(this);
    public ActionMode h;
    public as i;
    public Runnable j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements uaa {
        public final b a;
        public final sr b;
        public final tr c;
        public final View d;

        public a(b bVar, sr srVar, tr trVar, View view) {
            this.a = bVar;
            this.b = srVar;
            this.c = trVar;
            this.d = view;
        }

        @Override // defpackage.uaa
        public final boolean a(Menu menu) {
            return e(menu);
        }

        @Override // defpackage.uaa
        public final sk8 b() {
            return (sk8) this.c.invoke();
        }

        @Override // defpackage.uaa
        public final boolean c(Menu menu) {
            e(menu);
            return menu.size() > 0;
        }

        @Override // defpackage.uaa
        public final void d() {
            this.a.close();
        }

        public final boolean e(Menu menu) {
            int i;
            int i2;
            fca fcaVar = (fca) this.b.invoke();
            if (xj5.a(fcaVar, null)) {
                return false;
            }
            menu.clear();
            List<dca> list = fcaVar.a;
            int size = list.size();
            int i3 = 1;
            int i4 = 1;
            for (int i5 = 0; i5 < size; i5++) {
                dca dcaVar = list.get(i5);
                if (dcaVar instanceof sca) {
                    i = i3 + 1;
                    Object obj = dcaVar.a;
                    if (xj5.a(obj, pt9.D)) {
                        i2 = R.id.cut;
                    } else if (xj5.a(obj, pt9.E)) {
                        i2 = R.id.copy;
                    } else if (xj5.a(obj, pt9.F)) {
                        i2 = R.id.paste;
                    } else if (xj5.a(obj, pt9.G)) {
                        i2 = R.id.selectAll;
                    } else {
                        i2 = xj5.a(obj, pt9.H) ? R.id.autofill : i3;
                    }
                    final sca scaVar = (sca) dcaVar;
                    MenuItem menuItemAdd = menu.add(i4, i2, i3, scaVar.b);
                    menuItemAdd.setShowAsAction(2);
                    menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: yr
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            scaVar.d.invoke(this.a);
                            return true;
                        }
                    });
                } else {
                    if (dcaVar instanceof bda) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            i = i3 + 1;
                            bda bdaVar = (bda) dcaVar;
                            aka.b(menu, i3, this.d.getContext(), bdaVar.b, bdaVar.c);
                        }
                    } else if (dcaVar instanceof zca) {
                        i4++;
                    }
                }
                i3 = i;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements ada {
        public final zx0 a = da1.a(0, 7, null);

        @Override // defpackage.ada
        public final void close() {
            this.a.n(g2b.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zr(View view, oh4<? super uaa, ? extends uaa> oh4Var, mh4<? extends qq5> mh4Var) {
        this.a = view;
        this.b = oh4Var;
        this.c = mh4Var;
    }

    @Override // defpackage.wca
    public final Object a(gca gcaVar, p6a p6aVar) {
        cs csVar = new cs(this, gcaVar, null);
        w37 w37Var = this.d;
        w37Var.getClass();
        Object objD = u72.d(new t37(o37.t, w37Var, csVar, null), p6aVar);
        return objD == v72.t ? objD : g2b.a;
    }
}
