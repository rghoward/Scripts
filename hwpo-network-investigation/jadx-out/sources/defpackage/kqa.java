package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kqa extends q8 {
    public final androidx.appcompat.widget.c a;
    public final Window.Callback b;
    public final e c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList<q8.b> g = new ArrayList<>();
    public final a h = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            kqa kqaVar = kqa.this;
            Window.Callback callback = kqaVar.b;
            Menu menuQ = kqaVar.q();
            f fVar = menuQ instanceof f ? (f) menuQ : null;
            if (fVar != null) {
                fVar.w();
            }
            try {
                menuQ.clear();
                if (!callback.onCreatePanelMenu(0, menuQ) || !callback.onPreparePanel(0, null, menuQ)) {
                    menuQ.clear();
                }
            } finally {
                if (fVar != null) {
                    fVar.v();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements Toolbar.h {
        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c implements j.a {
        public boolean t;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(f fVar, boolean z) {
            if (this.t) {
                return;
            }
            this.t = true;
            kqa kqaVar = kqa.this;
            kqaVar.a.h();
            kqaVar.b.onPanelClosed(108, fVar);
            this.t = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(f fVar) {
            kqa.this.b.onMenuOpened(108, fVar);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(f fVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(f fVar) {
            kqa kqaVar = kqa.this;
            boolean zIsOverflowMenuShowing = kqaVar.a.a.isOverflowMenuShowing();
            Window.Callback callback = kqaVar.b;
            if (zIsOverflowMenuShowing) {
                callback.onPanelClosed(108, fVar);
            } else if (callback.onPreparePanel(0, null, fVar)) {
                callback.onMenuOpened(108, fVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e implements gz.c {
        public e() {
        }
    }

    public kqa(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        toolbar.getClass();
        androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(toolbar, false);
        this.a = cVar;
        callback.getClass();
        this.b = callback;
        cVar.k = callback;
        toolbar.setOnMenuItemClickListener(bVar);
        cVar.setWindowTitle(charSequence);
        this.c = new e();
    }

    @Override // defpackage.q8
    public final boolean a() {
        return this.a.a.hideOverflowMenu();
    }

    @Override // defpackage.q8
    public final boolean b() {
        androidx.appcompat.widget.c cVar = this.a;
        if (!cVar.a.hasExpandedActionView()) {
            return false;
        }
        cVar.collapseActionView();
        return true;
    }

    @Override // defpackage.q8
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList<q8.b> arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // defpackage.q8
    public final int d() {
        return this.a.b;
    }

    @Override // defpackage.q8
    public final Context e() {
        return this.a.a.getContext();
    }

    @Override // defpackage.q8
    public final boolean f() {
        androidx.appcompat.widget.c cVar = this.a;
        Toolbar toolbar = cVar.a;
        a aVar = this.h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = cVar.a;
        WeakHashMap<View, fib> weakHashMap = egb.a;
        toolbar2.postOnAnimation(aVar);
        return true;
    }

    @Override // defpackage.q8
    public final void h() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // defpackage.q8
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu menuQ = q();
        if (menuQ == null) {
            return false;
        }
        menuQ.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuQ.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.q8
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // defpackage.q8
    public final boolean k() {
        return this.a.a.showOverflowMenu();
    }

    @Override // defpackage.q8
    public final void m() {
        androidx.appcompat.widget.c cVar = this.a;
        cVar.j(cVar.b & (-9));
    }

    @Override // defpackage.q8
    public final void o(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    public final Menu q() {
        boolean z = this.e;
        androidx.appcompat.widget.c cVar = this.a;
        if (!z) {
            cVar.a.setMenuCallbacks(new c(), new d());
            this.e = true;
        }
        return cVar.a.getMenu();
    }

    @Override // defpackage.q8
    public final void g() {
    }

    @Override // defpackage.q8
    public final void l(boolean z) {
    }

    @Override // defpackage.q8
    public final void n(boolean z) {
    }
}
