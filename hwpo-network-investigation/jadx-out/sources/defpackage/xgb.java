package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xgb {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a implements kq8<Drawable> {
        public final /* synthetic */ mh4<g2b> a;

        public a(mh4<g2b> mh4Var) {
            this.a = mh4Var;
        }

        @Override // defpackage.kq8
        public final void a(Object obj, Object obj2, kf2 kf2Var) {
            obj2.getClass();
            kf2Var.getClass();
            this.a.invoke();
        }

        @Override // defpackage.kq8
        public final void b(j9a j9aVar) {
            j9aVar.getClass();
        }
    }

    public static void a(View view, final ei4 ei4Var) {
        et2 et2Var = i23.a;
        final ht4 ht4Var = ag6.a;
        view.getClass();
        ht4Var.getClass();
        final fl8 fl8Var = new fl8();
        final gl8 gl8Var = new gl8();
        view.setOnClickListener(new View.OnClickListener() { // from class: qgb
            /* JADX WARN: Type inference failed for: r7v2, types: [T, dz9] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                fl8 fl8Var2 = fl8Var;
                if (jCurrentTimeMillis - fl8Var2.t > 500) {
                    gl8 gl8Var2 = gl8Var;
                    el5 el5Var = (el5) gl8Var2.t;
                    if (el5Var != null) {
                        el5Var.k(null);
                    }
                    gl8Var2.t = oy0.c(dn4.t, ht4Var, x72.t, new tgb(ei4Var, view2, null));
                }
                fl8Var2.t = jCurrentTimeMillis;
            }
        });
    }

    public static void b(View view, e35 e35Var) {
        et2 et2Var = i23.a;
        ht4 ht4Var = ag6.a;
        ht4Var.getClass();
        m76 m76VarA = vib.a(view);
        if (m76VarA != null) {
            oy0.d(i76.a(m76VarA.getLifecycle()), ht4Var, null, new ugb(e35Var, null), 2);
        }
    }

    public static void c(final View view, final boolean z) {
        view.setAlpha(z ? 0.0f : 1.0f);
        view.setVisibility(0);
        view.animate().alpha(z ? 1.0f : 0.0f).withStartAction(new Runnable() { // from class: rgb
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                boolean z2 = z;
                view2.setClickable(z2);
                view2.setFocusable(z2);
            }
        }).withEndAction(new Runnable() { // from class: sgb
            @Override // java.lang.Runnable
            public final void run() {
                if (z) {
                    return;
                }
                view.setVisibility(8);
            }
        }).setDuration(500L).start();
    }

    public static r54 d(AppCompatEditText appCompatEditText) {
        return yk2.c(yk2.h(yk2.d(new wgb(appCompatEditText, null)), 250L), -1);
    }

    public static View e(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        viewInflate.getClass();
        return viewInflate;
    }

    public static final void f(ImageView imageView, String str, mh4<g2b> mh4Var) {
        imageView.getClass();
        lq8 lq8VarC = com.bumptech.glide.a.c(imageView.getContext());
        lq8VarC.getClass();
        rp8 rp8VarT = new rp8(lq8VarC.t, lq8VarC, Drawable.class, lq8VarC.u).z(str).d(k13.a).t(new a(mh4Var));
        x73 x73Var = new x73();
        x73Var.t = new l73(false);
        rp8 rp8VarA = rp8VarT.A(x73Var);
        rp8VarA.getClass();
        rp8VarA.y(imageView);
    }

    public static final void g(MaterialToolbar materialToolbar, int i, int i2) {
        Context context = materialToolbar.getContext();
        context.getClass();
        materialToolbar.setNavigationIcon(ou8.a(context, i, i2));
    }

    public static void h(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ac4.c("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i != -1) {
            marginLayoutParams.topMargin = i;
        }
        view.setLayoutParams(marginLayoutParams);
    }
}
