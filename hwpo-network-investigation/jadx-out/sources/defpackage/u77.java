package defpackage;

import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.f;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u77 {
    public final f a;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public final ArrayList b = new ArrayList();

    public u77(f fVar) {
        this.a = fVar;
        b();
    }

    public final MenuItem a(int i) {
        return (MenuItem) this.b.get(i);
    }

    public final void b() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.c = 0;
        this.d = 0;
        this.e = 0;
        int i = 0;
        while (true) {
            f fVar = this.a;
            if (i >= fVar.f.size()) {
                break;
            }
            MenuItem item = fVar.getItem(i);
            if (item.hasSubMenu()) {
                if (!arrayList.isEmpty() && !(p51.b(1, arrayList) instanceof w33) && item.isVisible()) {
                    arrayList.add(new w33());
                }
                arrayList.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    MenuItem item2 = subMenu.getItem(i2);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    arrayList.add(item2);
                    this.c++;
                    if (item2.isVisible()) {
                        this.d++;
                    }
                }
                arrayList.add(new w33());
            } else {
                arrayList.add(item);
                this.c++;
                if (item.isVisible()) {
                    this.d++;
                    this.e++;
                }
            }
            i++;
        }
        if (arrayList.isEmpty() || !(p51.b(1, arrayList) instanceof w33)) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
