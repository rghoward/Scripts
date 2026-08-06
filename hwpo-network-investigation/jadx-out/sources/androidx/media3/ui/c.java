package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import defpackage.aa0;
import defpackage.cp6;
import defpackage.d55;
import defpackage.esa;
import defpackage.fv6;
import defpackage.id4;
import defpackage.iu8;
import defpackage.jib;
import defpackage.k28;
import defpackage.k95;
import defpackage.lh8;
import defpackage.lsa;
import defpackage.md6;
import defpackage.n6b;
import defpackage.o38;
import defpackage.pn6;
import defpackage.ru2;
import defpackage.s28;
import defpackage.sa;
import defpackage.si4;
import defpackage.ti4;
import defpackage.toa;
import defpackage.ul8;
import defpackage.vua;
import defpackage.xl7;
import defpackage.z28;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends FrameLayout {
    public static final float[] a1;
    public final Class<?> A;
    public final String A0;
    public final Method B;
    public final Drawable B0;
    public final Method C;
    public final Drawable C0;
    public final CopyOnWriteArrayList<m> D;
    public final String D0;
    public final RecyclerView E;
    public final String E0;
    public final h F;
    public final Drawable F0;
    public final e G;
    public final Drawable G0;
    public final j H;
    public final String H0;
    public final b I;
    public final String I0;
    public final ru2 J;
    public s28 J0;
    public final PopupWindow K;
    public boolean K0;
    public final int L;
    public boolean L0;
    public final ImageView M;
    public boolean M0;
    public final ImageView N;
    public boolean N0;
    public final ImageView O;
    public boolean O0;
    public final View P;
    public boolean P0;
    public final View Q;
    public int Q0;
    public final TextView R;
    public boolean R0;
    public final TextView S;
    public int S0;
    public final ImageView T;
    public int T0;
    public final ImageView U;
    public long[] U0;
    public final ImageView V;
    public boolean[] V0;
    public final ImageView W;
    public final long[] W0;
    public final boolean[] X0;
    public long Y0;
    public boolean Z0;
    public final ImageView a0;
    public final ImageView b0;
    public final View c0;
    public final View d0;
    public final View e0;
    public final TextView f0;
    public final TextView g0;
    public final androidx.media3.ui.e h0;
    public final StringBuilder i0;
    public final Formatter j0;
    public final toa.b k0;
    public final toa.c l0;
    public final z28 m0;
    public final Drawable n0;
    public final Drawable o0;
    public final Drawable p0;
    public final Drawable q0;
    public final Drawable r0;
    public final String s0;
    public final o38 t;
    public final String t0;
    public final Resources u;
    public final String u0;
    public final Handler v;
    public final Drawable v0;
    public final ViewOnClickListenerC0023c w;
    public final Drawable w0;
    public final Class<?> x;
    public final float x0;
    public final Method y;
    public final float y0;
    public final Method z;
    public final String z0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements si4<View> {
        public final /* synthetic */ View a;
        public final /* synthetic */ ViewGroup b;

        public a(View view, ViewGroup viewGroup) {
            this.a = view;
            this.b = viewGroup;
        }

        @Override // defpackage.si4
        public final void a(Throwable th) {
            this.a.setVisibility(8);
        }

        @Override // defpackage.si4
        public final void onSuccess(View view) {
            View view2 = view;
            View view3 = this.a;
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
                aa0.c("The media route button placeholder missing layout params.");
                return;
            }
            view2.setId(R.id.exo_media_route_button_placeholder);
            view2.setLayoutParams(layoutParams);
            ViewGroup viewGroup = this.b;
            int iIndexOfChild = viewGroup.indexOfChild(view3);
            viewGroup.removeView(view3);
            viewGroup.addView(view2, iIndexOfChild);
            view2.setVisibility(0);
            c.this.t.h(view2, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b extends l {
        public b() {
            super();
        }

        @Override // androidx.media3.ui.c.l
        public final void v(i iVar) {
            iVar.u.setText(R.string.exo_track_selection_auto);
            s28 s28Var = c.this.J0;
            s28Var.getClass();
            iVar.v.setVisibility(x(s28Var.Q()) ? 4 : 0);
            iVar.a.setOnClickListener(new View.OnClickListener() { // from class: c38
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c cVar = c.this;
                    s28 s28Var2 = cVar.J0;
                    if (s28Var2 == null || !s28Var2.H(29)) {
                        return;
                    }
                    lsa lsaVarQ = cVar.J0.Q();
                    s28 s28Var3 = cVar.J0;
                    String str = n6b.a;
                    s28Var3.v(lsaVarQ.a().b(1).j(1, false).a());
                    c.h hVar = cVar.F;
                    hVar.e[1] = cVar.getResources().getString(R.string.exo_track_selection_auto);
                    cVar.K.dismiss();
                }
            });
        }

        @Override // androidx.media3.ui.c.l
        public final void w(String str) {
            c.this.F.e[1] = str;
        }

        public final boolean x(lsa lsaVar) {
            for (int i = 0; i < this.d.size(); i++) {
                if (lsaVar.v.containsKey(this.d.get(i).a.b)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class ViewOnClickListenerC0023c implements s28.c, androidx.media3.ui.e.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public ViewOnClickListenerC0023c() {
        }

        @Override // s28.c
        public final void n(s28.b bVar) {
            boolean zA = bVar.a(4, 5, 13);
            c cVar = c.this;
            if (zA) {
                cVar.q();
            }
            if (bVar.a(4, 5, 7, 13)) {
                cVar.s();
            }
            if (bVar.a(8, 13)) {
                cVar.t();
            }
            if (bVar.a(9, 13)) {
                cVar.v();
            }
            if (bVar.a(8, 9, 11, 0, 16, 17, 13)) {
                cVar.p();
            }
            if (bVar.a(11, 0, 13)) {
                cVar.w();
            }
            if (bVar.a(12, 13)) {
                cVar.r();
            }
            if (bVar.a(2, 13)) {
                cVar.x();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c cVar = c.this;
            ImageView imageView = cVar.W;
            View view2 = cVar.e0;
            View view3 = cVar.d0;
            View view4 = cVar.c0;
            o38 o38Var = cVar.t;
            s28 s28Var = cVar.J0;
            if (s28Var == null) {
                return;
            }
            o38Var.g();
            if (cVar.N == view) {
                if (s28Var.H(9)) {
                    s28Var.S();
                    return;
                }
                return;
            }
            if (cVar.M == view) {
                if (s28Var.H(7)) {
                    s28Var.x();
                    return;
                }
                return;
            }
            if (cVar.P == view) {
                if (s28Var.A() == 4 || !s28Var.H(12)) {
                    return;
                }
                s28Var.T();
                return;
            }
            if (cVar.Q == view) {
                if (s28Var.H(11)) {
                    s28Var.V();
                    return;
                }
                return;
            }
            if (cVar.O == view) {
                if (n6b.W(s28Var, cVar.N0)) {
                    n6b.E(s28Var);
                    return;
                } else {
                    if (s28Var.H(1)) {
                        s28Var.b();
                        return;
                    }
                    return;
                }
            }
            if (cVar.T == view) {
                if (s28Var.H(15)) {
                    int iM = s28Var.M();
                    int i = cVar.T0;
                    for (int i2 = 1; i2 <= 2; i2++) {
                        int i3 = (iM + i2) % 3;
                        if (i3 != 0) {
                            if (i3 != 1) {
                                if (i3 != 2 || (i & 2) == 0) {
                                }
                            } else if ((i & 1) == 0) {
                            }
                        }
                        iM = i3;
                    }
                    s28Var.I(iM);
                    return;
                }
                return;
            }
            if (cVar.U == view) {
                if (s28Var.H(14)) {
                    s28Var.m(!s28Var.P());
                    return;
                }
                return;
            }
            if (view4 == view) {
                o38Var.f();
                cVar.e(cVar.F, view4);
                return;
            }
            if (view3 == view) {
                o38Var.f();
                cVar.e(cVar.G, view3);
            } else if (view2 == view) {
                o38Var.f();
                cVar.e(cVar.I, view2);
            } else if (imageView == view) {
                o38Var.f();
                cVar.e(cVar.H, imageView);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            c cVar = c.this;
            if (cVar.Z0) {
                cVar.t.g();
            }
        }

        @Override // androidx.media3.ui.e.a
        public final void p(long j) {
            c cVar = c.this;
            TextView textView = cVar.g0;
            if (textView != null) {
                textView.setText(n6b.B(cVar.i0, cVar.j0, j));
            }
            if (cVar.k(cVar.J0)) {
                c.a(cVar, cVar.J0, j);
            }
        }

        @Override // androidx.media3.ui.e.a
        public final void q(long j) {
            c cVar = c.this;
            cVar.P0 = true;
            TextView textView = cVar.g0;
            if (textView != null) {
                textView.setText(n6b.B(cVar.i0, cVar.j0, j));
            }
            cVar.t.f();
            s28 s28Var = cVar.J0;
            if (s28Var != null && cVar.R0) {
                if (cVar.i(s28Var)) {
                    try {
                        Method method = cVar.y;
                        method.getClass();
                        method.invoke(cVar.J0, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        d55.a(e);
                        return;
                    }
                } else if (cVar.h(cVar.J0)) {
                    try {
                        Method method2 = cVar.B;
                        method2.getClass();
                        method2.invoke(cVar.J0, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        d55.a(e2);
                        return;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
                    s28 s28Var2 = cVar.J0;
                    s28Var2.getClass();
                    sb.append(s28Var2.getClass());
                    md6.g("PlayerControlView", sb.toString());
                }
            }
            if (cVar.k(cVar.J0)) {
                c.a(cVar, cVar.J0, j);
            }
        }

        @Override // androidx.media3.ui.e.a
        public final void v(long j, boolean z) {
            c cVar = c.this;
            cVar.P0 = false;
            s28 s28Var = cVar.J0;
            if (s28Var != null) {
                if (!z) {
                    c.a(cVar, s28Var, j);
                }
                if (cVar.i(cVar.J0)) {
                    try {
                        Method method = cVar.y;
                        method.getClass();
                        method.invoke(cVar.J0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        d55.a(e);
                        return;
                    }
                } else if (cVar.h(cVar.J0)) {
                    try {
                        Method method2 = cVar.B;
                        method2.getClass();
                        method2.invoke(cVar.J0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        d55.a(e2);
                        return;
                    }
                }
            }
            cVar.t.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Deprecated
    public interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class e extends RecyclerView.f<i> {
        public final String[] d;
        public final float[] e;
        public int f;

        public e(String[] strArr, float[] fArr) {
            this.d = strArr;
            this.e = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int f() {
            return this.d.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void j(RecyclerView.e0 e0Var, final int i) {
            i iVar = (i) e0Var;
            String[] strArr = this.d;
            if (i < strArr.length) {
                iVar.u.setText(strArr[i]);
            }
            if (i == this.f) {
                iVar.a.setSelected(true);
                iVar.v.setVisibility(0);
            } else {
                iVar.a.setSelected(false);
                iVar.v.setVisibility(4);
            }
            iVar.a.setOnClickListener(new View.OnClickListener() { // from class: d38
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.e eVar = this.t;
                    c cVar = c.this;
                    int i2 = eVar.f;
                    int i3 = i;
                    if (i3 != i2) {
                        cVar.setPlaybackSpeed(eVar.e[i3]);
                    }
                    cVar.K.dismiss();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final RecyclerView.e0 l(ViewGroup viewGroup, int i) {
            return new i(LayoutInflater.from(c.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface f {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class g extends RecyclerView.e0 {
        public final TextView u;
        public final TextView v;
        public final ImageView w;

        public g(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.u = (TextView) view.findViewById(R.id.exo_main_text);
            this.v = (TextView) view.findViewById(R.id.exo_sub_text);
            this.w = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: e38
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    c.g gVar = this.t;
                    c cVar = c.this;
                    int iC = gVar.c();
                    View view3 = cVar.c0;
                    if (iC == 0) {
                        c.e eVar = cVar.G;
                        view3.getClass();
                        cVar.e(eVar, view3);
                    } else {
                        if (iC != 1) {
                            cVar.K.dismiss();
                            return;
                        }
                        c.b bVar = cVar.I;
                        view3.getClass();
                        cVar.e(bVar, view3);
                    }
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class h extends RecyclerView.f<g> {
        public final String[] d;
        public final String[] e;
        public final Drawable[] f;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.d = strArr;
            this.e = new String[strArr.length];
            this.f = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int f() {
            return this.d.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final long g(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void j(RecyclerView.e0 e0Var, int i) {
            g gVar = (g) e0Var;
            if (u(i)) {
                gVar.a.setLayoutParams(new RecyclerView.p(-1, -2));
            } else {
                gVar.a.setLayoutParams(new RecyclerView.p(0, 0));
            }
            gVar.u.setText(this.d[i]);
            String str = this.e[i];
            TextView textView = gVar.v;
            if (str == null) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
            Drawable drawable = this.f[i];
            ImageView imageView = gVar.w;
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final RecyclerView.e0 l(ViewGroup viewGroup, int i) {
            c cVar = c.this;
            return cVar.new g(LayoutInflater.from(cVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }

        public final boolean u(int i) {
            c cVar = c.this;
            s28 s28Var = cVar.J0;
            if (s28Var == null) {
                return false;
            }
            if (i != 0) {
                return i != 1 || (s28Var.H(30) && cVar.J0.H(29));
            }
            return s28Var.H(13);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class i extends RecyclerView.e0 {
        public final TextView u;
        public final View v;

        public i(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.u = (TextView) view.findViewById(R.id.exo_text);
            this.v = view.findViewById(R.id.exo_check);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k {
        public final vua.a a;
        public final int b;
        public final String c;

        public k(vua vuaVar, int i, int i2, String str) {
            this.a = vuaVar.a.get(i);
            this.b = i2;
            this.c = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public abstract class l extends RecyclerView.f<i> {
        public List<k> d = new ArrayList();

        public l() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int f() {
            if (this.d.isEmpty()) {
                return 0;
            }
            return this.d.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final RecyclerView.e0 l(ViewGroup viewGroup, int i) {
            return new i(LayoutInflater.from(c.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0033  */
        @Override // androidx.recyclerview.widget.RecyclerView.f
        /* JADX INFO: renamed from: u */
        public void j(i iVar, int i) {
            boolean z;
            final s28 s28Var = c.this.J0;
            if (s28Var == null) {
                return;
            }
            if (i == 0) {
                v(iVar);
                return;
            }
            final k kVar = this.d.get(i - 1);
            final esa esaVar = kVar.a.b;
            if (s28Var.Q().v.get(esaVar) != null) {
                z = kVar.a.e[kVar.b];
            }
            iVar.u.setText(kVar.c);
            iVar.v.setVisibility(z ? 0 : 4);
            iVar.a.setOnClickListener(new View.OnClickListener() { // from class: g38
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s28 s28Var2 = s28Var;
                    if (s28Var2.H(29)) {
                        lsa.b bVarA = s28Var2.Q().a();
                        c.k kVar2 = kVar;
                        s28Var2.v(bVarA.f(new ksa(esaVar, k95.v(Integer.valueOf(kVar2.b)))).j(kVar2.a.b.c, false).a());
                        String str = kVar2.c;
                        c.l lVar = this.t;
                        lVar.w(str);
                        c.this.K.dismiss();
                    }
                }
            });
        }

        public abstract void v(i iVar);

        public abstract void w(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @Deprecated
    public interface m {
        void p(int i);
    }

    static {
        cp6.a("media3.ui");
        a1 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:100:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:101:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:31:0x0271  */
    /* JADX WARN: Code duplicated, block: B:34:0x0288  */
    /* JADX WARN: Code duplicated, block: B:35:0x028b  */
    /* JADX WARN: Code duplicated, block: B:39:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x02f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:55:0x0316  */
    /* JADX WARN: Code duplicated, block: B:58:0x031d  */
    /* JADX WARN: Code duplicated, block: B:61:0x033b  */
    /* JADX WARN: Code duplicated, block: B:64:0x034d  */
    /* JADX WARN: Code duplicated, block: B:67:0x036a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0395  */
    /* JADX WARN: Code duplicated, block: B:71:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:73:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:74:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:77:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:80:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x0408  */
    /* JADX WARN: Code duplicated, block: B:93:0x041a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0444  */
    /* JADX WARN: Code duplicated, block: B:97:0x0454  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public c(Context context, AttributeSet attributeSet) throws NoSuchMethodException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z8;
        Method method;
        Method method2;
        Class<?> cls;
        Method method3;
        Method method4;
        ImageView imageView;
        ImageView imageView2;
        View.OnClickListener onClickListener;
        int i18;
        ImageView imageView3;
        View.OnClickListener onClickListener2;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        androidx.media3.ui.e eVar;
        View viewFindViewById4;
        pn6.e eVar2;
        androidx.media3.ui.e eVar3;
        Resources resources;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        Typeface typefaceA;
        ImageView imageView7;
        TextView textView;
        View view;
        ImageView imageView8;
        TextView textView2;
        View view2;
        ImageView imageView9;
        ImageView imageView10;
        ImageView imageView11;
        boolean z9;
        super(context, null, 0);
        Class cls2 = Boolean.TYPE;
        this.N0 = true;
        this.Q0 = 5000;
        this.T0 = 0;
        this.S0 = 200;
        int resourceId = R.drawable.exo_styled_controls_previous;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, lh8.c, 0, 0);
            try {
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(12, R.drawable.exo_styled_controls_play);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(11, R.drawable.exo_styled_controls_pause);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(10, R.drawable.exo_styled_controls_next);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(7, R.drawable.exo_styled_controls_simple_fastforward);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(15, R.drawable.exo_styled_controls_previous);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(20, R.drawable.exo_styled_controls_simple_rewind);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(9, R.drawable.exo_styled_controls_fullscreen_exit);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(8, R.drawable.exo_styled_controls_fullscreen_enter);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(17, R.drawable.exo_styled_controls_repeat_off);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(18, R.drawable.exo_styled_controls_repeat_one);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(16, R.drawable.exo_styled_controls_repeat_all);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(35, R.drawable.exo_styled_controls_shuffle_on);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(34, R.drawable.exo_styled_controls_shuffle_off);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(37, R.drawable.exo_styled_controls_subtitle_on);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(36, R.drawable.exo_styled_controls_subtitle_off);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(42, R.drawable.exo_styled_controls_vr);
                this.Q0 = typedArrayObtainStyledAttributes.getInt(32, this.Q0);
                this.T0 = typedArrayObtainStyledAttributes.getInt(19, this.T0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                this.R0 = typedArrayObtainStyledAttributes.getBoolean(39, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(38, this.S0));
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                i4 = resourceId8;
                i8 = resourceId6;
                i14 = resourceId17;
                i12 = resourceId14;
                z6 = z12;
                i9 = resourceId10;
                i13 = resourceId15;
                z7 = z10;
                i10 = resourceId12;
                z4 = z14;
                i16 = resourceId2;
                i17 = resourceId16;
                z8 = z11;
                i3 = resourceId11;
                z3 = z15;
                i6 = resourceId4;
                i15 = resourceId3;
                i11 = resourceId13;
                z5 = z13;
                i5 = resourceId9;
                i7 = resourceId5;
                i2 = resourceId7;
                z2 = z16;
                z = z17;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = R.drawable.exo_styled_controls_simple_rewind;
            i3 = R.drawable.exo_styled_controls_repeat_one;
            i4 = R.drawable.exo_styled_controls_fullscreen_exit;
            i5 = R.drawable.exo_styled_controls_fullscreen_enter;
            i6 = R.drawable.exo_styled_controls_pause;
            i7 = R.drawable.exo_styled_controls_next;
            i8 = R.drawable.exo_styled_controls_simple_fastforward;
            i9 = R.drawable.exo_styled_controls_repeat_off;
            i10 = R.drawable.exo_styled_controls_repeat_all;
            i11 = R.drawable.exo_styled_controls_shuffle_on;
            i12 = R.drawable.exo_styled_controls_shuffle_off;
            i13 = R.drawable.exo_styled_controls_subtitle_on;
            z = true;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = true;
            z6 = true;
            z7 = true;
            i14 = R.drawable.exo_styled_controls_vr;
            i15 = R.drawable.exo_styled_controls_play;
            i16 = R.layout.exo_player_control_view;
            i17 = R.drawable.exo_styled_controls_subtitle_off;
            z8 = true;
        }
        LayoutInflater.from(context).inflate(i16, this);
        setDescendantFocusability(262144);
        this.w = new ViewOnClickListenerC0023c();
        this.D = new CopyOnWriteArrayList<>();
        this.k0 = new toa.b();
        this.l0 = new toa.c();
        StringBuilder sb = new StringBuilder();
        this.i0 = sb;
        int i19 = i15;
        this.j0 = new Formatter(sb, Locale.getDefault());
        this.U0 = new long[0];
        this.V0 = new boolean[0];
        this.W0 = new long[0];
        this.X0 = new boolean[0];
        this.m0 = new z28(this, 0);
        try {
            method = ExoPlayer.class.getMethod("setScrubbingModeEnabled", cls2);
            try {
                method2 = ExoPlayer.class.getMethod("isScrubbingModeEnabled", null);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method2 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            method = null;
        }
        this.x = ExoPlayer.class;
        this.y = method;
        this.z = method2;
        try {
            cls = Class.forName("androidx.media3.transformer.CompositionPlayer");
            try {
                method3 = cls.getMethod("setScrubbingModeEnabled", cls2);
                try {
                    method4 = cls.getMethod("isScrubbingModeEnabled", null);
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    method4 = null;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                method3 = null;
                method4 = null;
                this.A = cls;
                this.B = method3;
                this.C = method4;
                this.f0 = (TextView) findViewById(R.id.exo_duration);
                this.g0 = (TextView) findViewById(R.id.exo_position);
                imageView = (ImageView) findViewById(R.id.exo_subtitle);
                this.W = imageView;
                if (imageView != null) {
                    imageView.setOnClickListener(this.w);
                }
                imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
                this.a0 = imageView2;
                onClickListener = new View.OnClickListener() { // from class: a38
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        c cVar = this.t;
                        cVar.o(!cVar.K0);
                    }
                };
                if (imageView2 == null) {
                    i18 = 8;
                } else {
                    i18 = 8;
                    imageView2.setVisibility(8);
                    imageView2.setOnClickListener(onClickListener);
                }
                imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
                this.b0 = imageView3;
                onClickListener2 = new View.OnClickListener() { // from class: a38
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        c cVar = this.t;
                        cVar.o(!cVar.K0);
                    }
                };
                if (imageView3 != null) {
                    imageView3.setVisibility(i18);
                    imageView3.setOnClickListener(onClickListener2);
                }
                viewFindViewById = findViewById(R.id.exo_settings);
                this.c0 = viewFindViewById;
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(this.w);
                }
                viewFindViewById2 = findViewById(R.id.exo_playback_speed);
                this.d0 = viewFindViewById2;
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setOnClickListener(this.w);
                }
                viewFindViewById3 = findViewById(R.id.exo_audio_track);
                this.e0 = viewFindViewById3;
                if (viewFindViewById3 != null) {
                    viewFindViewById3.setOnClickListener(this.w);
                }
                eVar = (androidx.media3.ui.e) findViewById(R.id.exo_progress);
                viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
                if (eVar != null) {
                    if (viewFindViewById4 != null) {
                        androidx.media3.ui.b bVar = new androidx.media3.ui.b(context, attributeSet);
                        bVar.setId(R.id.exo_progress);
                        bVar.setLayoutParams(viewFindViewById4.getLayoutParams());
                        ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
                        int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
                        viewGroup.removeView(viewFindViewById4);
                        viewGroup.addView(bVar, iIndexOfChild);
                        this.h0 = bVar;
                    } else {
                        eVar2 = null;
                        this.h0 = null;
                    }
                    eVar3 = this.h0;
                    if (eVar3 != null) {
                        eVar3.a(this.w);
                    }
                    this.v = n6b.p(eVar2);
                    resources = context.getResources();
                    this.u = resources;
                    imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
                    this.O = imageView4;
                    if (imageView4 != null) {
                        imageView4.setOnClickListener(this.w);
                    }
                    imageView5 = (ImageView) findViewById(R.id.exo_prev);
                    this.M = imageView5;
                    if (imageView5 != null) {
                        imageView5.setImageDrawable(resources.getDrawable(resourceId, context.getTheme()));
                        imageView5.setOnClickListener(this.w);
                    }
                    imageView6 = (ImageView) findViewById(R.id.exo_next);
                    this.N = imageView6;
                    if (imageView6 != null) {
                        imageView6.setImageDrawable(resources.getDrawable(i7, context.getTheme()));
                        imageView6.setOnClickListener(this.w);
                    }
                    typefaceA = iu8.a(context, R.font.roboto_medium_numbers);
                    imageView7 = (ImageView) findViewById(R.id.exo_rew);
                    textView = (TextView) findViewById(R.id.exo_rew_with_amount);
                    if (imageView7 != null) {
                        imageView7.setImageDrawable(resources.getDrawable(i2, context.getTheme()));
                        this.Q = imageView7;
                        this.S = null;
                    } else if (textView != null) {
                        textView.setTypeface(typefaceA);
                        this.S = textView;
                        this.Q = textView;
                    } else {
                        this.S = null;
                        this.Q = null;
                    }
                    view = this.Q;
                    if (view != null) {
                        view.setOnClickListener(this.w);
                    }
                    imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
                    textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
                    if (imageView8 != null) {
                        imageView8.setImageDrawable(resources.getDrawable(i8, context.getTheme()));
                        this.P = imageView8;
                        this.R = null;
                    } else if (textView2 != null) {
                        textView2.setTypeface(typefaceA);
                        this.R = textView2;
                        this.P = textView2;
                    } else {
                        this.R = null;
                        this.P = null;
                    }
                    view2 = this.P;
                    if (view2 != null) {
                        view2.setOnClickListener(this.w);
                    }
                    imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
                    this.T = imageView9;
                    if (imageView9 != null) {
                        imageView9.setOnClickListener(this.w);
                    }
                    imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
                    this.U = imageView10;
                    if (imageView10 != null) {
                        imageView10.setOnClickListener(this.w);
                    }
                    this.x0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                    this.y0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                    imageView11 = (ImageView) findViewById(R.id.exo_vr);
                    this.V = imageView11;
                    if (imageView11 != null) {
                        imageView11.setImageDrawable(resources.getDrawable(i14, context.getTheme()));
                        n(imageView11, false);
                    }
                    o38 o38Var = new o38(this);
                    this.t = o38Var;
                    o38Var.D = z;
                    h hVar = new h(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
                    this.F = hVar;
                    this.L = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
                    RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
                    this.E = recyclerView;
                    recyclerView.setAdapter(hVar);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                    PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
                    this.K = popupWindow;
                    popupWindow.setOnDismissListener(this.w);
                    this.Z0 = true;
                    this.J = new ru2(getResources());
                    this.B0 = resources.getDrawable(i13, context.getTheme());
                    this.C0 = resources.getDrawable(i17, context.getTheme());
                    this.D0 = resources.getString(R.string.exo_controls_cc_enabled_description);
                    this.E0 = resources.getString(R.string.exo_controls_cc_disabled_description);
                    this.H = new j();
                    this.I = new b();
                    this.G = new e(resources.getStringArray(R.array.exo_controls_playback_speeds), a1);
                    this.n0 = resources.getDrawable(i19, context.getTheme());
                    this.o0 = resources.getDrawable(i6, context.getTheme());
                    this.F0 = resources.getDrawable(i4, context.getTheme());
                    this.G0 = resources.getDrawable(i5, context.getTheme());
                    this.p0 = resources.getDrawable(i9, context.getTheme());
                    this.q0 = resources.getDrawable(i3, context.getTheme());
                    this.r0 = resources.getDrawable(i10, context.getTheme());
                    this.v0 = resources.getDrawable(i11, context.getTheme());
                    this.w0 = resources.getDrawable(i12, context.getTheme());
                    this.H0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
                    this.I0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
                    this.s0 = resources.getString(R.string.exo_controls_repeat_off_description);
                    this.t0 = resources.getString(R.string.exo_controls_repeat_one_description);
                    this.u0 = resources.getString(R.string.exo_controls_repeat_all_description);
                    this.z0 = resources.getString(R.string.exo_controls_shuffle_on_description);
                    this.A0 = resources.getString(R.string.exo_controls_shuffle_off_description);
                    o38Var.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
                    o38Var.h(this.P, z8);
                    o38Var.h(this.Q, z7);
                    o38Var.h(imageView5, z6);
                    o38Var.h(imageView6, z5);
                    o38Var.h(imageView10, z4);
                    o38Var.h(imageView, z3);
                    o38Var.h(imageView11, z2);
                    if (this.T0 != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    o38Var.h(imageView9, z9);
                    addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: b38
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view3, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
                            c cVar = this.a;
                            int i28 = cVar.L;
                            PopupWindow popupWindow2 = cVar.K;
                            int i29 = i23 - i21;
                            int i30 = i27 - i25;
                            if (!(i22 - i20 == i26 - i24 && i29 == i30) && popupWindow2.isShowing()) {
                                cVar.u();
                                popupWindow2.update(view3, (cVar.getWidth() - popupWindow2.getWidth()) - i28, (-popupWindow2.getHeight()) - i28, -1, -1);
                            }
                        }
                    });
                }
                this.h0 = eVar;
                eVar2 = null;
                eVar3 = this.h0;
                if (eVar3 != null) {
                    eVar3.a(this.w);
                }
                this.v = n6b.p(eVar2);
                resources = context.getResources();
                this.u = resources;
                imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
                this.O = imageView4;
                if (imageView4 != null) {
                    imageView4.setOnClickListener(this.w);
                }
                imageView5 = (ImageView) findViewById(R.id.exo_prev);
                this.M = imageView5;
                if (imageView5 != null) {
                    imageView5.setImageDrawable(resources.getDrawable(resourceId, context.getTheme()));
                    imageView5.setOnClickListener(this.w);
                }
                imageView6 = (ImageView) findViewById(R.id.exo_next);
                this.N = imageView6;
                if (imageView6 != null) {
                    imageView6.setImageDrawable(resources.getDrawable(i7, context.getTheme()));
                    imageView6.setOnClickListener(this.w);
                }
                typefaceA = iu8.a(context, R.font.roboto_medium_numbers);
                imageView7 = (ImageView) findViewById(R.id.exo_rew);
                textView = (TextView) findViewById(R.id.exo_rew_with_amount);
                if (imageView7 != null) {
                    imageView7.setImageDrawable(resources.getDrawable(i2, context.getTheme()));
                    this.Q = imageView7;
                    this.S = null;
                } else if (textView != null) {
                    textView.setTypeface(typefaceA);
                    this.S = textView;
                    this.Q = textView;
                } else {
                    this.S = null;
                    this.Q = null;
                }
                view = this.Q;
                if (view != null) {
                    view.setOnClickListener(this.w);
                }
                imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
                textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
                if (imageView8 != null) {
                    imageView8.setImageDrawable(resources.getDrawable(i8, context.getTheme()));
                    this.P = imageView8;
                    this.R = null;
                } else if (textView2 != null) {
                    textView2.setTypeface(typefaceA);
                    this.R = textView2;
                    this.P = textView2;
                } else {
                    this.R = null;
                    this.P = null;
                }
                view2 = this.P;
                if (view2 != null) {
                    view2.setOnClickListener(this.w);
                }
                imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
                this.T = imageView9;
                if (imageView9 != null) {
                    imageView9.setOnClickListener(this.w);
                }
                imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
                this.U = imageView10;
                if (imageView10 != null) {
                    imageView10.setOnClickListener(this.w);
                }
                this.x0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                this.y0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                imageView11 = (ImageView) findViewById(R.id.exo_vr);
                this.V = imageView11;
                if (imageView11 != null) {
                    imageView11.setImageDrawable(resources.getDrawable(i14, context.getTheme()));
                    n(imageView11, false);
                }
                o38 o38Var2 = new o38(this);
                this.t = o38Var2;
                o38Var2.D = z;
                h hVar2 = new h(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
                this.F = hVar2;
                this.L = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
                RecyclerView recyclerView2 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
                this.E = recyclerView2;
                recyclerView2.setAdapter(hVar2);
                recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
                PopupWindow popupWindow2 = new PopupWindow((View) recyclerView2, -2, -2, true);
                this.K = popupWindow2;
                popupWindow2.setOnDismissListener(this.w);
                this.Z0 = true;
                this.J = new ru2(getResources());
                this.B0 = resources.getDrawable(i13, context.getTheme());
                this.C0 = resources.getDrawable(i17, context.getTheme());
                this.D0 = resources.getString(R.string.exo_controls_cc_enabled_description);
                this.E0 = resources.getString(R.string.exo_controls_cc_disabled_description);
                this.H = new j();
                this.I = new b();
                this.G = new e(resources.getStringArray(R.array.exo_controls_playback_speeds), a1);
                this.n0 = resources.getDrawable(i19, context.getTheme());
                this.o0 = resources.getDrawable(i6, context.getTheme());
                this.F0 = resources.getDrawable(i4, context.getTheme());
                this.G0 = resources.getDrawable(i5, context.getTheme());
                this.p0 = resources.getDrawable(i9, context.getTheme());
                this.q0 = resources.getDrawable(i3, context.getTheme());
                this.r0 = resources.getDrawable(i10, context.getTheme());
                this.v0 = resources.getDrawable(i11, context.getTheme());
                this.w0 = resources.getDrawable(i12, context.getTheme());
                this.H0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
                this.I0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
                this.s0 = resources.getString(R.string.exo_controls_repeat_off_description);
                this.t0 = resources.getString(R.string.exo_controls_repeat_one_description);
                this.u0 = resources.getString(R.string.exo_controls_repeat_all_description);
                this.z0 = resources.getString(R.string.exo_controls_shuffle_on_description);
                this.A0 = resources.getString(R.string.exo_controls_shuffle_off_description);
                o38Var2.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
                o38Var2.h(this.P, z8);
                o38Var2.h(this.Q, z7);
                o38Var2.h(imageView5, z6);
                o38Var2.h(imageView6, z5);
                o38Var2.h(imageView10, z4);
                o38Var2.h(imageView, z3);
                o38Var2.h(imageView11, z2);
                if (this.T0 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                o38Var2.h(imageView9, z9);
                addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: b38
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view3, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
                        c cVar = this.a;
                        int i28 = cVar.L;
                        PopupWindow popupWindow3 = cVar.K;
                        int i29 = i23 - i21;
                        int i30 = i27 - i25;
                        if (!(i22 - i20 == i26 - i24 && i29 == i30) && popupWindow3.isShowing()) {
                            cVar.u();
                            popupWindow3.update(view3, (cVar.getWidth() - popupWindow3.getWidth()) - i28, (-popupWindow3.getHeight()) - i28, -1, -1);
                        }
                    }
                });
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused5) {
            cls = null;
        }
        this.A = cls;
        this.B = method3;
        this.C = method4;
        this.f0 = (TextView) findViewById(R.id.exo_duration);
        this.g0 = (TextView) findViewById(R.id.exo_position);
        imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.W = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.w);
        }
        imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.a0 = imageView2;
        onClickListener = new View.OnClickListener() { // from class: a38
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                c cVar = this.t;
                cVar.o(!cVar.K0);
            }
        };
        if (imageView2 == null) {
            i18 = 8;
        } else {
            i18 = 8;
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(onClickListener);
        }
        imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.b0 = imageView3;
        onClickListener2 = new View.OnClickListener() { // from class: a38
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                c cVar = this.t;
                cVar.o(!cVar.K0);
            }
        };
        if (imageView3 != null) {
            imageView3.setVisibility(i18);
            imageView3.setOnClickListener(onClickListener2);
        }
        viewFindViewById = findViewById(R.id.exo_settings);
        this.c0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this.w);
        }
        viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.d0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this.w);
        }
        viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.e0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this.w);
        }
        eVar = (androidx.media3.ui.e) findViewById(R.id.exo_progress);
        viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (eVar != null) {
            if (viewFindViewById4 != null) {
                androidx.media3.ui.b bVar2 = new androidx.media3.ui.b(context, attributeSet);
                bVar2.setId(R.id.exo_progress);
                bVar2.setLayoutParams(viewFindViewById4.getLayoutParams());
                ViewGroup viewGroup2 = (ViewGroup) viewFindViewById4.getParent();
                int iIndexOfChild2 = viewGroup2.indexOfChild(viewFindViewById4);
                viewGroup2.removeView(viewFindViewById4);
                viewGroup2.addView(bVar2, iIndexOfChild2);
                this.h0 = bVar2;
            } else {
                eVar2 = null;
                this.h0 = null;
            }
            eVar3 = this.h0;
            if (eVar3 != null) {
                eVar3.a(this.w);
            }
            this.v = n6b.p(eVar2);
            resources = context.getResources();
            this.u = resources;
            imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
            this.O = imageView4;
            if (imageView4 != null) {
                imageView4.setOnClickListener(this.w);
            }
            imageView5 = (ImageView) findViewById(R.id.exo_prev);
            this.M = imageView5;
            if (imageView5 != null) {
                imageView5.setImageDrawable(resources.getDrawable(resourceId, context.getTheme()));
                imageView5.setOnClickListener(this.w);
            }
            imageView6 = (ImageView) findViewById(R.id.exo_next);
            this.N = imageView6;
            if (imageView6 != null) {
                imageView6.setImageDrawable(resources.getDrawable(i7, context.getTheme()));
                imageView6.setOnClickListener(this.w);
            }
            typefaceA = iu8.a(context, R.font.roboto_medium_numbers);
            imageView7 = (ImageView) findViewById(R.id.exo_rew);
            textView = (TextView) findViewById(R.id.exo_rew_with_amount);
            if (imageView7 != null) {
                imageView7.setImageDrawable(resources.getDrawable(i2, context.getTheme()));
                this.Q = imageView7;
                this.S = null;
            } else if (textView != null) {
                textView.setTypeface(typefaceA);
                this.S = textView;
                this.Q = textView;
            } else {
                this.S = null;
                this.Q = null;
            }
            view = this.Q;
            if (view != null) {
                view.setOnClickListener(this.w);
            }
            imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
            textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
            if (imageView8 != null) {
                imageView8.setImageDrawable(resources.getDrawable(i8, context.getTheme()));
                this.P = imageView8;
                this.R = null;
            } else if (textView2 != null) {
                textView2.setTypeface(typefaceA);
                this.R = textView2;
                this.P = textView2;
            } else {
                this.R = null;
                this.P = null;
            }
            view2 = this.P;
            if (view2 != null) {
                view2.setOnClickListener(this.w);
            }
            imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
            this.T = imageView9;
            if (imageView9 != null) {
                imageView9.setOnClickListener(this.w);
            }
            imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
            this.U = imageView10;
            if (imageView10 != null) {
                imageView10.setOnClickListener(this.w);
            }
            this.x0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
            this.y0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
            imageView11 = (ImageView) findViewById(R.id.exo_vr);
            this.V = imageView11;
            if (imageView11 != null) {
                imageView11.setImageDrawable(resources.getDrawable(i14, context.getTheme()));
                n(imageView11, false);
            }
            o38 o38Var3 = new o38(this);
            this.t = o38Var3;
            o38Var3.D = z;
            h hVar3 = new h(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
            this.F = hVar3;
            this.L = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
            RecyclerView recyclerView3 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
            this.E = recyclerView3;
            recyclerView3.setAdapter(hVar3);
            recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
            PopupWindow popupWindow3 = new PopupWindow((View) recyclerView3, -2, -2, true);
            this.K = popupWindow3;
            popupWindow3.setOnDismissListener(this.w);
            this.Z0 = true;
            this.J = new ru2(getResources());
            this.B0 = resources.getDrawable(i13, context.getTheme());
            this.C0 = resources.getDrawable(i17, context.getTheme());
            this.D0 = resources.getString(R.string.exo_controls_cc_enabled_description);
            this.E0 = resources.getString(R.string.exo_controls_cc_disabled_description);
            this.H = new j();
            this.I = new b();
            this.G = new e(resources.getStringArray(R.array.exo_controls_playback_speeds), a1);
            this.n0 = resources.getDrawable(i19, context.getTheme());
            this.o0 = resources.getDrawable(i6, context.getTheme());
            this.F0 = resources.getDrawable(i4, context.getTheme());
            this.G0 = resources.getDrawable(i5, context.getTheme());
            this.p0 = resources.getDrawable(i9, context.getTheme());
            this.q0 = resources.getDrawable(i3, context.getTheme());
            this.r0 = resources.getDrawable(i10, context.getTheme());
            this.v0 = resources.getDrawable(i11, context.getTheme());
            this.w0 = resources.getDrawable(i12, context.getTheme());
            this.H0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
            this.I0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
            this.s0 = resources.getString(R.string.exo_controls_repeat_off_description);
            this.t0 = resources.getString(R.string.exo_controls_repeat_one_description);
            this.u0 = resources.getString(R.string.exo_controls_repeat_all_description);
            this.z0 = resources.getString(R.string.exo_controls_shuffle_on_description);
            this.A0 = resources.getString(R.string.exo_controls_shuffle_off_description);
            o38Var3.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
            o38Var3.h(this.P, z8);
            o38Var3.h(this.Q, z7);
            o38Var3.h(imageView5, z6);
            o38Var3.h(imageView6, z5);
            o38Var3.h(imageView10, z4);
            o38Var3.h(imageView, z3);
            o38Var3.h(imageView11, z2);
            if (this.T0 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            o38Var3.h(imageView9, z9);
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: b38
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view3, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
                    c cVar = this.a;
                    int i28 = cVar.L;
                    PopupWindow popupWindow4 = cVar.K;
                    int i29 = i23 - i21;
                    int i30 = i27 - i25;
                    if (!(i22 - i20 == i26 - i24 && i29 == i30) && popupWindow4.isShowing()) {
                        cVar.u();
                        popupWindow4.update(view3, (cVar.getWidth() - popupWindow4.getWidth()) - i28, (-popupWindow4.getHeight()) - i28, -1, -1);
                    }
                }
            });
        }
        this.h0 = eVar;
        eVar2 = null;
        eVar3 = this.h0;
        if (eVar3 != null) {
            eVar3.a(this.w);
        }
        this.v = n6b.p(eVar2);
        resources = context.getResources();
        this.u = resources;
        imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.O = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(this.w);
        }
        imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.M = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(resourceId, context.getTheme()));
            imageView5.setOnClickListener(this.w);
        }
        imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.N = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i7, context.getTheme()));
            imageView6.setOnClickListener(this.w);
        }
        typefaceA = iu8.a(context, R.font.roboto_medium_numbers);
        imageView7 = (ImageView) findViewById(R.id.exo_rew);
        textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i2, context.getTheme()));
            this.Q = imageView7;
            this.S = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceA);
            this.S = textView;
            this.Q = textView;
        } else {
            this.S = null;
            this.Q = null;
        }
        view = this.Q;
        if (view != null) {
            view.setOnClickListener(this.w);
        }
        imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i8, context.getTheme()));
            this.P = imageView8;
            this.R = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceA);
            this.R = textView2;
            this.P = textView2;
        } else {
            this.R = null;
            this.P = null;
        }
        view2 = this.P;
        if (view2 != null) {
            view2.setOnClickListener(this.w);
        }
        imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.T = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(this.w);
        }
        imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.U = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this.w);
        }
        this.x0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.y0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.V = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(i14, context.getTheme()));
            n(imageView11, false);
        }
        o38 o38Var4 = new o38(this);
        this.t = o38Var4;
        o38Var4.D = z;
        h hVar4 = new h(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.F = hVar4;
        this.L = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView4 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.E = recyclerView4;
        recyclerView4.setAdapter(hVar4);
        recyclerView4.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow4 = new PopupWindow((View) recyclerView4, -2, -2, true);
        this.K = popupWindow4;
        popupWindow4.setOnDismissListener(this.w);
        this.Z0 = true;
        this.J = new ru2(getResources());
        this.B0 = resources.getDrawable(i13, context.getTheme());
        this.C0 = resources.getDrawable(i17, context.getTheme());
        this.D0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.E0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.H = new j();
        this.I = new b();
        this.G = new e(resources.getStringArray(R.array.exo_controls_playback_speeds), a1);
        this.n0 = resources.getDrawable(i19, context.getTheme());
        this.o0 = resources.getDrawable(i6, context.getTheme());
        this.F0 = resources.getDrawable(i4, context.getTheme());
        this.G0 = resources.getDrawable(i5, context.getTheme());
        this.p0 = resources.getDrawable(i9, context.getTheme());
        this.q0 = resources.getDrawable(i3, context.getTheme());
        this.r0 = resources.getDrawable(i10, context.getTheme());
        this.v0 = resources.getDrawable(i11, context.getTheme());
        this.w0 = resources.getDrawable(i12, context.getTheme());
        this.H0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.I0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.s0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.t0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.u0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.z0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.A0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        o38Var4.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        o38Var4.h(this.P, z8);
        o38Var4.h(this.Q, z7);
        o38Var4.h(imageView5, z6);
        o38Var4.h(imageView6, z5);
        o38Var4.h(imageView10, z4);
        o38Var4.h(imageView, z3);
        o38Var4.h(imageView11, z2);
        if (this.T0 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        o38Var4.h(imageView9, z9);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: b38
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
                c cVar = this.a;
                int i28 = cVar.L;
                PopupWindow popupWindow5 = cVar.K;
                int i29 = i23 - i21;
                int i30 = i27 - i25;
                if (!(i22 - i20 == i26 - i24 && i29 == i30) && popupWindow5.isShowing()) {
                    cVar.u();
                    popupWindow5.update(view3, (cVar.getWidth() - popupWindow5.getWidth()) - i28, (-popupWindow5.getHeight()) - i28, -1, -1);
                }
            }
        });
    }

    public static void a(c cVar, s28 s28Var, long j2) {
        if (cVar.O0) {
            if (s28Var.H(17) && s28Var.H(10)) {
                toa toaVarN = s28Var.N();
                int iO = toaVarN.o();
                int i2 = 0;
                while (true) {
                    long jZ = n6b.Z(toaVarN.m(i2, cVar.l0, 0L).m);
                    if (j2 < jZ) {
                        break;
                    }
                    if (i2 == iO - 1) {
                        j2 = jZ;
                        break;
                    } else {
                        j2 -= jZ;
                        i2++;
                    }
                }
                s28Var.j(i2, j2);
            }
        } else if (s28Var.H(5)) {
            s28Var.w(j2);
        }
        cVar.s();
    }

    public static boolean c(s28 s28Var, toa.c cVar) {
        toa toaVarN;
        int iO;
        if (!s28Var.H(17) || (iO = (toaVarN = s28Var.N()).o()) <= 1 || iO > 100) {
            return false;
        }
        for (int i2 = 0; i2 < iO; i2++) {
            if (toaVarN.m(i2, cVar, 0L).m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f2) {
        s28 s28Var = this.J0;
        if (s28Var == null || !s28Var.H(13)) {
            return;
        }
        s28 s28Var2 = this.J0;
        s28Var2.c(new k28(f2, s28Var2.e().b));
    }

    public final boolean d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        s28 s28Var = this.J0;
        if (s28Var == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (s28Var.A() != 4 && s28Var.H(12)) {
                    s28Var.T();
                }
            } else if (keyCode == 89 && s28Var.H(11)) {
                s28Var.V();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (n6b.W(s28Var, this.N0)) {
                        n6b.E(s28Var);
                    } else if (s28Var.H(1)) {
                        s28Var.b();
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            n6b.E(s28Var);
                        } else if (keyCode == 127) {
                            String str = n6b.a;
                            if (s28Var.H(1)) {
                                s28Var.b();
                            }
                        }
                    } else if (s28Var.H(7)) {
                        s28Var.x();
                    }
                } else if (s28Var.H(9)) {
                    s28Var.S();
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return d(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e(RecyclerView.f<?> fVar, View view) {
        this.E.setAdapter(fVar);
        u();
        this.Z0 = false;
        PopupWindow popupWindow = this.K;
        popupWindow.dismiss();
        this.Z0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i2 = this.L;
        popupWindow.showAsDropDown(view, width - i2, (-popupWindow.getHeight()) - i2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    public final ul8 f(vua vuaVar, int i2) {
        String strA;
        String string;
        String strD;
        String str;
        k95.a aVar = new k95.a();
        k95<vua.a> k95Var = vuaVar.a;
        int i3 = 0;
        while (i3 < k95Var.size()) {
            vua.a aVar2 = k95Var.get(i3);
            if (aVar2.b.c == i2) {
                int i4 = 0;
                while (i4 < aVar2.a) {
                    if (aVar2.d[i4] == 4) {
                        id4 id4Var = aVar2.b.d[i4];
                        int i5 = id4Var.e;
                        int i6 = id4Var.j;
                        if ((i5 & 2) == 0) {
                            ru2 ru2Var = this.J;
                            Resources resources = ru2Var.a;
                            Resources resources2 = ru2Var.a;
                            String str2 = id4Var.o;
                            int i7 = id4Var.G;
                            int i8 = id4Var.w;
                            int i9 = id4Var.v;
                            String str3 = id4Var.k;
                            int iH = fv6.h(str2);
                            if (iH == -1) {
                                if (str3 != null) {
                                    String[] strArrX = n6b.X(str3);
                                    int length = strArrX.length;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < length) {
                                            strD = fv6.d(strArrX[i10]);
                                            if (strD != null && fv6.m(strD)) {
                                                break;
                                            }
                                            i10++;
                                        } else {
                                            strD = null;
                                            break;
                                        }
                                    }
                                } else {
                                    strD = null;
                                    break;
                                }
                                if (strD == null) {
                                    if (str3 != null) {
                                        String[] strArrX2 = n6b.X(str3);
                                        int length2 = strArrX2.length;
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 < length2) {
                                                String strD2 = fv6.d(strArrX2[i11]);
                                                if (strD2 != null && fv6.i(strD2)) {
                                                    str = strD2;
                                                    break;
                                                }
                                                i11++;
                                            } else {
                                                str = null;
                                                break;
                                            }
                                        }
                                    } else {
                                        str = null;
                                        break;
                                    }
                                    if (str != null) {
                                        iH = 1;
                                    } else if (i9 != -1 || i8 != -1) {
                                        iH = 2;
                                    } else if (i7 == -1 && id4Var.H == -1) {
                                        iH = -1;
                                    } else {
                                        iH = 1;
                                    }
                                } else {
                                    iH = 2;
                                }
                            }
                            String string2 = BuildConfig.FLAVOR;
                            if (iH == 2) {
                                String strB = ru2Var.b(id4Var);
                                String string3 = (i9 == -1 || i8 == -1) ? BuildConfig.FLAVOR : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i9), Integer.valueOf(i8));
                                if (i6 != -1) {
                                    string2 = resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i6 / 1000000.0f));
                                }
                                strA = ru2Var.c(strB, string3, string2);
                            } else if (iH == 1) {
                                String strA2 = ru2Var.a(id4Var);
                                if (i7 == -1 || i7 < 1) {
                                    string = BuildConfig.FLAVOR;
                                } else if (i7 == 1) {
                                    string = resources.getString(R.string.exo_track_mono);
                                } else if (i7 == 2) {
                                    string = resources.getString(R.string.exo_track_stereo);
                                } else if (i7 == 6 || i7 == 7) {
                                    string = resources.getString(R.string.exo_track_surround_5_point_1);
                                } else {
                                    string = i7 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
                                }
                                if (i6 != -1) {
                                    string2 = resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i6 / 1000000.0f));
                                }
                                strA = ru2Var.c(strA2, string, string2);
                            } else {
                                strA = ru2Var.a(id4Var);
                            }
                            if (strA.isEmpty()) {
                                String str4 = id4Var.d;
                                strA = (str4 == null || str4.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str4);
                            }
                            aVar.c(new k(vuaVar, i3, i4, strA));
                        }
                    }
                    i4++;
                    k95Var = k95Var;
                    aVar2 = aVar2;
                }
            }
            i3++;
            k95Var = k95Var;
        }
        return aVar.g();
    }

    public final void g() {
        o38 o38Var = this.t;
        int i2 = o38Var.A;
        if (i2 == 3 || i2 == 2) {
            return;
        }
        o38Var.f();
        if (!o38Var.D) {
            o38Var.i(2);
        } else if (o38Var.A == 1) {
            o38Var.n.start();
        } else {
            o38Var.o.start();
        }
    }

    public s28 getPlayer() {
        return this.J0;
    }

    public int getRepeatToggleModes() {
        return this.T0;
    }

    public boolean getShowShuffleButton() {
        return this.t.b(this.U);
    }

    public boolean getShowSubtitleButton() {
        return this.t.b(this.W);
    }

    public int getShowTimeoutMs() {
        return this.Q0;
    }

    public boolean getShowVrButton() {
        return this.t.b(this.V);
    }

    public final boolean h(s28 s28Var) {
        Class<?> cls;
        return (s28Var == null || (cls = this.A) == null || !cls.isAssignableFrom(s28Var.getClass())) ? false : true;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i(s28 s28Var) {
        Class<?> cls;
        return (s28Var == null || (cls = this.x) == null || !cls.isAssignableFrom(s28Var.getClass())) ? false : true;
    }

    public final boolean j() {
        o38 o38Var = this.t;
        return o38Var.A == 0 && o38Var.a.l();
    }

    public final boolean k(s28 s28Var) {
        try {
            if (i(s28Var)) {
                Method method = this.z;
                method.getClass();
                Object objInvoke = method.invoke(s28Var, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
            if (h(s28Var)) {
                Method method2 = this.C;
                method2.getClass();
                Object objInvoke2 = method2.invoke(s28Var, null);
                objInvoke2.getClass();
                if (((Boolean) objInvoke2).booleanValue()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalAccessException e2) {
            e = e2;
            d55.a(e);
            return false;
        } catch (InvocationTargetException e3) {
            e = e3;
            d55.a(e);
            return false;
        }
    }

    public final boolean l() {
        return getVisibility() == 0;
    }

    public final void m() {
        q();
        p();
        t();
        v();
        x();
        r();
        w();
    }

    public final void n(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.x0 : this.y0);
    }

    public final void o(boolean z) {
        if (this.K0 == z) {
            return;
        }
        this.K0 = z;
        String str = this.I0;
        Drawable drawable = this.G0;
        String str2 = this.H0;
        Drawable drawable2 = this.F0;
        ImageView imageView = this.a0;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.b0;
        if (imageView2 == null) {
            return;
        }
        if (z) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o38 o38Var = this.t;
        o38Var.a.addOnLayoutChangeListener(o38Var.y);
        this.L0 = true;
        if (j()) {
            o38Var.g();
        }
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o38 o38Var = this.t;
        o38Var.a.removeOnLayoutChangeListener(o38Var.y);
        this.L0 = false;
        removeCallbacks(this.m0);
        o38Var.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.t.b;
        if (view != null) {
            view.layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    public final void p() {
        boolean zH;
        boolean zH2;
        boolean zH3;
        boolean zH4;
        boolean zH5;
        if (l() && this.L0) {
            s28 s28Var = this.J0;
            if (s28Var != null) {
                zH = (this.M0 && c(s28Var, this.l0)) ? s28Var.H(10) : s28Var.H(5);
                zH3 = s28Var.H(7);
                zH4 = s28Var.H(11);
                zH5 = s28Var.H(12);
                zH2 = s28Var.H(9);
            } else {
                zH = false;
                zH2 = false;
                zH3 = false;
                zH4 = false;
                zH5 = false;
            }
            Resources resources = this.u;
            View view = this.Q;
            if (zH4) {
                s28 s28Var2 = this.J0;
                int iY = (int) ((s28Var2 != null ? s28Var2.Y() : 5000L) / 1000);
                TextView textView = this.S;
                if (textView != null) {
                    textView.setText(String.valueOf(iY));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, iY, Integer.valueOf(iY)));
                }
            }
            View view2 = this.P;
            if (zH5) {
                s28 s28Var3 = this.J0;
                int iY2 = (int) ((s28Var3 != null ? s28Var3.y() : 15000L) / 1000);
                TextView textView2 = this.R;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iY2));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, iY2, Integer.valueOf(iY2)));
                }
            }
            n(this.M, zH3);
            n(view, zH4);
            n(view2, zH5);
            n(this.N, zH2);
            androidx.media3.ui.e eVar = this.h0;
            if (eVar != null) {
                eVar.setEnabled(zH);
            }
        }
    }

    public final void q() {
        ImageView imageView;
        if (l() && this.L0 && (imageView = this.O) != null) {
            boolean zW = n6b.W(this.J0, this.N0);
            Drawable drawable = zW ? this.n0 : this.o0;
            int i2 = zW ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.u.getString(i2));
            s28 s28Var = this.J0;
            boolean z = false;
            if (s28Var != null) {
                int iA = s28Var.A();
                boolean z2 = (s28Var.H(16) && s28Var.l() == null) ? false : true;
                boolean zH = s28Var.H(1);
                boolean z3 = iA == 1 && s28Var.H(2);
                boolean z4 = iA == 4 && s28Var.H(4);
                if (z2 && (zH || z3 || z4)) {
                    z = true;
                }
            }
            n(imageView, z);
        }
    }

    public final void r() {
        e eVar;
        s28 s28Var = this.J0;
        if (s28Var == null) {
            return;
        }
        float f2 = s28Var.e().a;
        float f3 = Float.MAX_VALUE;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            eVar = this.G;
            float[] fArr = eVar.e;
            if (i2 >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f2 - fArr[i2]);
            if (fAbs < f3) {
                i3 = i2;
                f3 = fAbs;
            }
            i2++;
        }
        eVar.f = i3;
        String str = eVar.d[i3];
        h hVar = this.F;
        hVar.e[0] = str;
        n(this.c0, hVar.u(1) || hVar.u(0));
    }

    public final void s() {
        long jZ;
        long jR;
        if (l() && this.L0) {
            s28 s28Var = this.J0;
            if (s28Var == null || !s28Var.H(16)) {
                jZ = 0;
                jR = 0;
            } else {
                jZ = s28Var.z() + this.Y0;
                jR = s28Var.R() + this.Y0;
            }
            TextView textView = this.g0;
            if (textView != null && !this.P0) {
                textView.setText(n6b.B(this.i0, this.j0, jZ));
            }
            androidx.media3.ui.e eVar = this.h0;
            if (eVar != null) {
                eVar.setPosition(jZ);
                if (k(s28Var)) {
                    jR = jZ;
                }
                eVar.setBufferedPosition(jR);
            }
            z28 z28Var = this.m0;
            removeCallbacks(z28Var);
            int iA = s28Var == null ? 1 : s28Var.A();
            if (s28Var != null && s28Var.C()) {
                long jMin = Math.min(eVar != null ? eVar.getPreferredUpdateDelay() : 1000L, 1000 - (jZ % 1000));
                float f2 = s28Var.e().a;
                postDelayed(z28Var, n6b.j(f2 > 0.0f ? (long) (jMin / f2) : 1000L, this.S0, 1000L));
            } else {
                if (iA == 4 || iA == 1) {
                    return;
                }
                postDelayed(z28Var, 1000L);
            }
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.t.D = z;
    }

    public void setMediaRouteButtonViewProvider(jib jibVar) {
        View viewFindViewById = findViewById(R.id.exo_media_route_button_placeholder);
        if (viewFindViewById == null) {
            aa0.c("The media route button placeholder is missing.");
            return;
        }
        if (jibVar == null) {
            viewFindViewById.setVisibility(8);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
        if (viewGroup == null) {
            aa0.c("The media route button placeholder has no parent view.");
            return;
        }
        ListenableFuture listenableFutureA = jibVar.a();
        a aVar = new a(viewFindViewById, viewGroup);
        final Handler handler = this.v;
        Objects.requireNonNull(handler);
        listenableFutureA.Q(new ti4.a(listenableFutureA, aVar), new Executor() { // from class: y28
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        });
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(d dVar) {
        boolean z = dVar != null;
        ImageView imageView = this.a0;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = dVar != null;
        ImageView imageView2 = this.b0;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(s28 s28Var) {
        xl7.r(Looper.myLooper() == Looper.getMainLooper());
        xl7.g(s28Var == null || s28Var.O() == Looper.getMainLooper());
        s28 s28Var2 = this.J0;
        if (s28Var2 == s28Var) {
            return;
        }
        ViewOnClickListenerC0023c viewOnClickListenerC0023c = this.w;
        if (s28Var2 != null) {
            s28Var2.J(viewOnClickListenerC0023c);
        }
        this.J0 = s28Var;
        if (s28Var != null) {
            s28Var.n(viewOnClickListenerC0023c);
        }
        m();
    }

    public void setRepeatToggleModes(int i2) {
        this.T0 = i2;
        s28 s28Var = this.J0;
        if (s28Var != null && s28Var.H(15)) {
            int iM = this.J0.M();
            if (i2 == 0 && iM != 0) {
                this.J0.I(0);
            } else if (i2 == 1 && iM == 2) {
                this.J0.I(1);
            } else if (i2 == 2 && iM == 1) {
                this.J0.I(2);
            }
        }
        this.t.h(this.T, i2 != 0);
        t();
    }

    public void setShowFastForwardButton(boolean z) {
        this.t.h(this.P, z);
        p();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.M0 = z;
        w();
    }

    public void setShowNextButton(boolean z) {
        this.t.h(this.N, z);
        p();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.N0 = z;
        q();
    }

    public void setShowPreviousButton(boolean z) {
        this.t.h(this.M, z);
        p();
    }

    public void setShowRewindButton(boolean z) {
        this.t.h(this.Q, z);
        p();
    }

    public void setShowShuffleButton(boolean z) {
        this.t.h(this.U, z);
        v();
    }

    public void setShowSubtitleButton(boolean z) {
        this.t.h(this.W, z);
    }

    public void setShowTimeoutMs(int i2) {
        this.Q0 = i2;
        if (j()) {
            this.t.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.t.h(this.V, z);
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.S0 = n6b.i(i2, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        this.R0 = z;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.V;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            n(imageView, onClickListener != null);
        }
    }

    public final void t() {
        ImageView imageView;
        if (l() && this.L0 && (imageView = this.T) != null) {
            if (this.T0 == 0) {
                n(imageView, false);
                return;
            }
            s28 s28Var = this.J0;
            String str = this.s0;
            Drawable drawable = this.p0;
            if (s28Var == null || !s28Var.H(15)) {
                n(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            n(imageView, true);
            int iM = s28Var.M();
            if (iM == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iM == 1) {
                imageView.setImageDrawable(this.q0);
                imageView.setContentDescription(this.t0);
            } else {
                if (iM != 2) {
                    return;
                }
                imageView.setImageDrawable(this.r0);
                imageView.setContentDescription(this.u0);
            }
        }
    }

    public final void u() {
        RecyclerView recyclerView = this.E;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i2 = this.L;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i2 * 2));
        PopupWindow popupWindow = this.K;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i2 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void v() {
        ImageView imageView;
        if (l() && this.L0 && (imageView = this.U) != null) {
            s28 s28Var = this.J0;
            if (!this.t.b(imageView)) {
                n(imageView, false);
                return;
            }
            String str = this.A0;
            Drawable drawable = this.w0;
            if (s28Var == null || !s28Var.H(14)) {
                n(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            n(imageView, true);
            if (s28Var.P()) {
                drawable = this.v0;
            }
            imageView.setImageDrawable(drawable);
            if (s28Var.P()) {
                str = this.z0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x013c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r2v11, types: [toa] */
    /* JADX WARN: Type inference failed for: r2v12, types: [toa] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r4v13, types: [sa] */
    /* JADX WARN: Type inference failed for: r7v1, types: [toa$b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void w() {
        long jN;
        int i2;
        ?? r2;
        ?? r22;
        boolean z;
        ?? r3;
        boolean[] zArr;
        boolean z2;
        int length;
        s28 s28Var = this.J0;
        if (s28Var == null) {
            return;
        }
        boolean z3 = this.M0;
        toa.c cVar = this.l0;
        boolean z4 = false;
        boolean z5 = true;
        this.O0 = z3 && c(s28Var, cVar);
        long j2 = 0;
        this.Y0 = 0L;
        toa toaVarN = s28Var.H(17) ? s28Var.N() : toa.a;
        long j3 = -9223372036854775807L;
        if (toaVarN.p()) {
            if (s28Var.H(16)) {
                long jO = s28Var.o();
                if (jO != -9223372036854775807L) {
                    jN = n6b.N(jO);
                } else {
                    jN = 0;
                }
            } else {
                jN = 0;
            }
            i2 = 0;
        } else {
            int iG = s28Var.G();
            boolean z6 = this.O0;
            int i3 = z6 ? 0 : iG;
            int iO = z6 ? toaVarN.o() - 1 : iG;
            i2 = 0;
            long j4 = 0;
            ?? r4 = toaVarN;
            while (i3 <= iO) {
                long j5 = j2;
                if (i3 == iG) {
                    this.Y0 = n6b.Z(j4);
                }
                r4.n(i3, cVar);
                if (cVar.m == j3) {
                    xl7.r(this.O0 ^ z5);
                    break;
                }
                int i4 = cVar.n;
                ?? r5 = r4;
                while (i4 <= cVar.o) {
                    ?? r7 = this.k0;
                    r5.f(i4, r7, z4);
                    long j6 = j3;
                    sa saVar = r7.g;
                    saVar.getClass();
                    int i5 = saVar.a;
                    for (?? r10 = z4; r10 < i5; r10++) {
                        r7.d(r10);
                        long j7 = r7.e;
                        if (j7 >= j5) {
                            long[] jArr = this.U0;
                            if (i2 == jArr.length) {
                                if (jArr.length == 0) {
                                    r2 = r5;
                                    length = 1;
                                } else {
                                    r2 = r5;
                                    length = jArr.length * 2;
                                }
                                this.U0 = Arrays.copyOf(jArr, length);
                                this.V0 = Arrays.copyOf(this.V0, length);
                            }
                            r2 = r5;
                            this.U0[i2] = n6b.Z(j7 + j4);
                            boolean[] zArr2 = this.V0;
                            sa.a aVarA = r7.g.a(r10);
                            int i6 = aVarA.a;
                            if (i6 != -1) {
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= i6) {
                                        r3 = r2;
                                        zArr = zArr2;
                                        r22 = r3;
                                        z = true;
                                        z2 = false;
                                        break;
                                    }
                                    zArr = zArr2;
                                    int i8 = aVarA.e[i7];
                                    ?? r23 = r3;
                                    z = true;
                                    if (i8 == 0) {
                                        r3 = r2;
                                    } else if (i8 != 1) {
                                        i7++;
                                        zArr2 = zArr;
                                        r3 = r23;
                                    }
                                    z2 = true;
                                    r22 = r23;
                                    break;
                                }
                            }
                            zArr = zArr2;
                            r22 = r2;
                            z = true;
                            z2 = true;
                            zArr[i2] = !z2;
                            i2++;
                        } else {
                            r2 = r5;
                            r22 = r2;
                            z = true;
                        }
                        z5 = z;
                        iG = iG;
                        r2 = r22;
                        j5 = 0;
                    }
                    r2 = r5;
                    i4++;
                    j3 = j6;
                    r5 = r2;
                    z4 = false;
                    j5 = 0;
                }
                j4 += cVar.m;
                i3++;
                z5 = z5;
                r4 = r5;
                z4 = false;
                j2 = 0;
            }
            jN = j4;
        }
        long jZ = n6b.Z(jN);
        TextView textView = this.f0;
        if (textView != null) {
            textView.setText(n6b.B(this.i0, this.j0, jZ));
        }
        androidx.media3.ui.e eVar = this.h0;
        if (eVar != null) {
            eVar.setDuration(jZ);
            long[] jArr2 = this.W0;
            int length2 = jArr2.length;
            int i9 = i2 + length2;
            long[] jArr3 = this.U0;
            if (i9 > jArr3.length) {
                this.U0 = Arrays.copyOf(jArr3, i9);
                this.V0 = Arrays.copyOf(this.V0, i9);
            }
            System.arraycopy(jArr2, 0, this.U0, i2, length2);
            System.arraycopy(this.X0, 0, this.V0, i2, length2);
            eVar.b(this.U0, this.V0, i9);
        }
        s();
    }

    public final void x() {
        j jVar = this.H;
        jVar.getClass();
        List<k> list = Collections.EMPTY_LIST;
        jVar.d = list;
        b bVar = this.I;
        bVar.getClass();
        bVar.d = list;
        s28 s28Var = this.J0;
        ImageView imageView = this.W;
        if (s28Var != null && s28Var.H(30) && this.J0.H(29)) {
            vua vuaVarB = this.J0.B();
            ul8 ul8VarF = f(vuaVarB, 1);
            bVar.d = ul8VarF;
            c cVar = c.this;
            s28 s28Var2 = cVar.J0;
            h hVar = cVar.F;
            s28Var2.getClass();
            lsa lsaVarQ = s28Var2.Q();
            if (ul8VarF.isEmpty()) {
                hVar.e[1] = cVar.getResources().getString(R.string.exo_track_selection_none);
            } else if (bVar.x(lsaVarQ)) {
                for (int i2 = 0; i2 < ul8VarF.w; i2++) {
                    k kVar = (k) ul8VarF.get(i2);
                    if (kVar.a.e[kVar.b]) {
                        hVar.e[1] = kVar.c;
                        break;
                    }
                }
            } else {
                hVar.e[1] = cVar.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.t.b(imageView)) {
                jVar.x(f(vuaVarB, 3));
            } else {
                jVar.x(ul8.x);
            }
        }
        n(imageView, jVar.f() > 0);
        h hVar2 = this.F;
        n(this.c0, hVar2.u(1) || hVar2.u(0));
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class j extends l {
        public j() {
            super();
        }

        @Override // androidx.media3.ui.c.l, androidx.recyclerview.widget.RecyclerView.f
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final void j(i iVar, int i) {
            super.j(iVar, i);
            if (i > 0) {
                k kVar = this.d.get(i - 1);
                iVar.v.setVisibility(kVar.a.e[kVar.b] ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.c.l
        public final void v(i iVar) {
            boolean z;
            iVar.u.setText(R.string.exo_track_selection_none);
            int i = 0;
            while (true) {
                if (i >= this.d.size()) {
                    z = true;
                    break;
                }
                k kVar = this.d.get(i);
                if (kVar.a.e[kVar.b]) {
                    z = false;
                    break;
                }
                i++;
            }
            iVar.v.setVisibility(z ? 0 : 4);
            iVar.a.setOnClickListener(new View.OnClickListener() { // from class: f38
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c cVar = c.this;
                    s28 s28Var = cVar.J0;
                    if (s28Var == null || !s28Var.H(29)) {
                        return;
                    }
                    cVar.J0.v(cVar.J0.Q().a().b(3).e().g(null).i().a());
                    cVar.K.dismiss();
                }
            });
        }

        public final void x(List<k> list) {
            c cVar = c.this;
            ImageView imageView = cVar.W;
            boolean z = false;
            for (int i = 0; i < ((ul8) list).w; i++) {
                k kVar = (k) ((ul8) list).get(i);
                if (kVar.a.e[kVar.b]) {
                    z = true;
                    break;
                }
            }
            if (imageView != null) {
                imageView.setImageDrawable(z ? cVar.B0 : cVar.C0);
                imageView.setContentDescription(z ? cVar.D0 : cVar.E0);
            }
            this.d = list;
        }

        @Override // androidx.media3.ui.c.l
        public final void w(String str) {
        }
    }

    public void setProgressUpdateListener(f fVar) {
    }
}
