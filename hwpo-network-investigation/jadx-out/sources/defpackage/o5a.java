package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o5a extends ActionMode {
    public final Context a;
    public final u8 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements u8.a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList<o5a> c = new ArrayList<>();
        public final ep9<Menu, Menu> d = new ep9<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        @Override // u8.a
        public final boolean a(u8 u8Var, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(u8Var), new qr6(this.b, (s5a) menuItem));
        }

        @Override // u8.a
        public final void b(u8 u8Var) {
            this.a.onDestroyActionMode(e(u8Var));
        }

        @Override // u8.a
        public final boolean c(u8 u8Var, Menu menu) {
            o5a o5aVarE = e(u8Var);
            ep9<Menu, Menu> ep9Var = this.d;
            Menu es6Var = ep9Var.get(menu);
            if (es6Var == null) {
                es6Var = new es6(this.b, (q5a) menu);
                ep9Var.put(menu, es6Var);
            }
            return this.a.onCreateActionMode(o5aVarE, es6Var);
        }

        @Override // u8.a
        public final boolean d(u8 u8Var, Menu menu) {
            o5a o5aVarE = e(u8Var);
            ep9<Menu, Menu> ep9Var = this.d;
            Menu es6Var = ep9Var.get(menu);
            if (es6Var == null) {
                es6Var = new es6(this.b, (q5a) menu);
                ep9Var.put(menu, es6Var);
            }
            return this.a.onPrepareActionMode(o5aVarE, es6Var);
        }

        public final o5a e(u8 u8Var) {
            ArrayList<o5a> arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                o5a o5aVar = arrayList.get(i);
                if (o5aVar != null && o5aVar.b == u8Var) {
                    return o5aVar;
                }
            }
            o5a o5aVar2 = new o5a(this.b, u8Var);
            arrayList.add(o5aVar2);
            return o5aVar2;
        }
    }

    public o5a(Context context, u8 u8Var) {
        this.a = context;
        this.b = u8Var;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new es6(this.a, this.b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.t;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.u;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.t = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.p(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.n(i);
    }
}
