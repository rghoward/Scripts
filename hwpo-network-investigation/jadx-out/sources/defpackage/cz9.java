package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.a;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cz9 extends u8 implements f.a {
    public f A;
    public Context v;
    public ActionBarContextView w;
    public gz.e x;
    public WeakReference<View> y;
    public boolean z;

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(f fVar, MenuItem menuItem) {
        return this.x.a.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(f fVar) {
        i();
        a aVar = this.w.w;
        if (aVar != null) {
            aVar.n();
        }
    }

    @Override // defpackage.u8
    public final void c() {
        if (this.z) {
            return;
        }
        this.z = true;
        this.x.b(this);
    }

    @Override // defpackage.u8
    public final View d() {
        WeakReference<View> weakReference = this.y;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // defpackage.u8
    public final f e() {
        return this.A;
    }

    @Override // defpackage.u8
    public final MenuInflater f() {
        return new r5a(this.w.getContext());
    }

    @Override // defpackage.u8
    public final CharSequence g() {
        return this.w.getSubtitle();
    }

    @Override // defpackage.u8
    public final CharSequence h() {
        return this.w.getTitle();
    }

    @Override // defpackage.u8
    public final void i() {
        this.x.d(this, this.A);
    }

    @Override // defpackage.u8
    public final boolean j() {
        return this.w.L;
    }

    @Override // defpackage.u8
    public final void k(View view) {
        this.w.setCustomView(view);
        this.y = view != null ? new WeakReference<>(view) : null;
    }

    @Override // defpackage.u8
    public final void l(int i) {
        m(this.v.getString(i));
    }

    @Override // defpackage.u8
    public final void m(CharSequence charSequence) {
        this.w.setSubtitle(charSequence);
    }

    @Override // defpackage.u8
    public final void n(int i) {
        o(this.v.getString(i));
    }

    @Override // defpackage.u8
    public final void o(CharSequence charSequence) {
        this.w.setTitle(charSequence);
    }

    @Override // defpackage.u8
    public final void p(boolean z) {
        this.u = z;
        this.w.setTitleOptional(z);
    }
}
