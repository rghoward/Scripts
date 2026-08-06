package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rk0 {
    public final Context a;
    public ep9<s5a, MenuItem> b;
    public ep9<t5a, SubMenu> c;

    public rk0(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof s5a)) {
            return menuItem;
        }
        s5a s5aVar = (s5a) menuItem;
        if (this.b == null) {
            this.b = new ep9<>();
        }
        MenuItem menuItem2 = this.b.get(s5aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        qr6 qr6Var = new qr6(this.a, s5aVar);
        this.b.put(s5aVar, qr6Var);
        return qr6Var;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof t5a)) {
            return subMenu;
        }
        t5a t5aVar = (t5a) subMenu;
        if (this.c == null) {
            this.c = new ep9<>();
        }
        SubMenu subMenu2 = this.c.get(t5aVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        t3a t3aVar = new t3a(this.a, t5aVar);
        this.c.put(t5aVar, t3aVar);
        return t3aVar;
    }
}
