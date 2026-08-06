package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.c;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oqa implements View.OnClickListener {
    public final t8 t;
    public final /* synthetic */ c u;

    public oqa(c cVar) {
        this.u = cVar;
        Context context = cVar.a.getContext();
        CharSequence charSequence = cVar.h;
        t8 t8Var = new t8();
        t8Var.e = 4096;
        t8Var.g = 4096;
        t8Var.l = null;
        t8Var.m = null;
        t8Var.n = false;
        t8Var.o = false;
        t8Var.p = 16;
        t8Var.i = context;
        t8Var.a = charSequence;
        this.t = t8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c cVar = this.u;
        Window.Callback callback = cVar.k;
        if (callback == null || !cVar.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.t);
    }
}
