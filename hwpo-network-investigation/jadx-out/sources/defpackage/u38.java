package defpackage;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.i;
import androidx.media3.ui.PlayerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u38 extends ay4 {
    public androidx.media3.exoplayer.d A;
    public boolean B = true;
    public final vg4 C = new vg4(new c());
    public final shb D;
    public final o7a E;
    public int F;
    public final b G;
    public static final /* synthetic */ ho5<Object>[] H = {new ne8(u38.class, "binding", "getBinding()Lcom/hwpo_training_app/player/databinding/FragmentPlayerBinding;", 0)};
    public static final a Companion = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class a {
        public static u38 a(String[] strArr, int i) {
            strArr.getClass();
            u38 u38Var = new u38();
            u38Var.setArguments(uy0.c(new js7("playback_url", strArr), new js7("start_position", Integer.valueOf(i))));
            return u38Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class b implements s28.c {
        public b() {
        }

        @Override // s28.c
        public final void g(h28 h28Var) {
            h28Var.getClass();
            a aVar = u38.Companion;
            u38.this.q().i(h28Var);
        }

        @Override // s28.c
        public final void h0(boolean z) {
            a aVar = u38.Companion;
            u38.this.p().c.setKeepScreenOn(z);
        }

        @Override // s28.c
        public final void x(int i) {
            a aVar = u38.Companion;
            k48 k48VarQ = u38.this.q();
            if (i == 3) {
                k48VarQ.e(new t28.b(false));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class c implements oh4<u38, lf4> {
        @Override // defpackage.oh4
        public final lf4 invoke(u38 u38Var) {
            u38 u38Var2 = u38Var;
            u38Var2.getClass();
            return lf4.bind(u38Var2.requireView());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class d extends wp5 implements mh4<androidx.fragment.app.f> {
        public d() {
            super(0);
        }

        @Override // defpackage.mh4
        public final androidx.fragment.app.f invoke() {
            return u38.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class e extends wp5 implements mh4<whb> {
        public final /* synthetic */ d u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.u = dVar;
        }

        @Override // defpackage.mh4
        public final whb invoke() {
            return (whb) this.u.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class f extends wp5 implements mh4<vhb> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final vhb invoke() {
            return ((whb) this.u.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class g extends wp5 implements mh4<lb2> {
        public final /* synthetic */ ss5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ss5 ss5Var) {
            super(0);
            this.u = ss5Var;
        }

        @Override // defpackage.mh4
        public final lb2 invoke() {
            whb whbVar = (whb) this.u.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return wt4Var != null ? wt4Var.getDefaultViewModelCreationExtras() : lb2.a.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class h extends wp5 implements mh4<thb.c> {
        public final /* synthetic */ ss5 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ss5 ss5Var) {
            super(0);
            this.v = ss5Var;
        }

        @Override // defpackage.mh4
        public final thb.c invoke() {
            thb.c defaultViewModelProviderFactory;
            whb whbVar = (whb) this.v.getValue();
            wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
            return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? u38.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public u38() {
        ss5 ss5VarC = hv5.c(j26.u, new e(new d()));
        this.D = new shb(ll8.a(k48.class), new f(ss5VarC), new h(ss5VarC), new g(ss5VarC));
        this.E = new o7a(new r38(0));
        this.F = 1;
        this.G = new b();
    }

    @Override // defpackage.hk0
    public final void j() {
        q().x.b();
    }

    @Override // androidx.fragment.app.f
    public final void onDestroyView() {
        super.onDestroyView();
        androidx.fragment.app.g activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(this.F);
        }
    }

    @Override // androidx.fragment.app.f
    public final void onStart() {
        super.onStart();
        k48 k48VarQ = q();
        oy0.d(rhb.b(k48VarQ), null, null, new j48(k48VarQ, null), 3);
    }

    @Override // androidx.fragment.app.f
    public final void onStop() {
        super.onStop();
        s();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        androidx.fragment.app.g activity = getActivity();
        this.F = activity != null ? activity.getRequestedOrientation() : 1;
        androidx.fragment.app.g activity2 = getActivity();
        if (activity2 != null) {
            activity2.setRequestedOrientation(13);
        }
        FrameLayout frameLayout = p().c;
        frameLayout.getClass();
        ee5.a(new gi4() { // from class: s38
            @Override // defpackage.gi4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                u38.a aVar = u38.Companion;
                ((View) obj4).getClass();
                FrameLayout frameLayout2 = this.t.p().c;
                frameLayout2.getClass();
                frameLayout2.setPadding(0, iIntValue2, 0, iIntValue);
                return g2b.a;
            }
        }, frameLayout);
        k48 k48VarQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        k48VarQ.c(viewLifecycleOwner, new oh4() { // from class: t38
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                gm3 gm3Var = (gm3) obj;
                u38.a aVar = u38.Companion;
                gm3Var.getClass();
                boolean z = gm3Var instanceof p38;
                u38 u38Var = this.t;
                if (z) {
                    u38Var.B = false;
                    u38Var.s();
                    u38Var.r((s10) u38Var.q().C.d());
                } else if (gm3Var instanceof q38) {
                    u38Var.r(((q38) gm3Var).b);
                }
                return g2b.a;
            }
        });
        q().B.e(getViewLifecycleOwner(), new v38(new xi7(1, this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lf4 p() {
        return (lf4) this.C.a(this, H[0]);
    }

    public final k48 q() {
        return (k48) this.D.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void r(s10 s10Var) {
        cv2.d dVar;
        int i;
        HlsMediaSource.Factory factory;
        ArrayList arrayList;
        toa toaVar;
        Pair<Object, Long> pairS0;
        final HlsMediaSource.Factory factory2 = new HlsMediaSource.Factory((qr2.a) this.E.getValue());
        factory2.k = this.B;
        int i2 = 0;
        factory2.b = new nr2(false);
        final cv2 cv2Var = new cv2(requireContext());
        synchronized (cv2Var.c) {
            dVar = cv2Var.f;
        }
        dVar.getClass();
        cv2.d.a aVar = new cv2.d.a(dVar);
        aVar.k(s10Var != null ? s10Var.toString() : null);
        cv2Var.g(new cv2.d(aVar));
        ExoPlayer.b bVar = new ExoPlayer.b(requireActivity().getApplicationContext());
        int i3 = 1;
        xl7.r(!bVar.A);
        bVar.e = new l5a() { // from class: so3
            @Override // defpackage.l5a
            public final Object get() {
                return cv2Var;
            }
        };
        xl7.r(!bVar.A);
        bVar.d = new l5a() { // from class: to3
            @Override // defpackage.l5a
            public final Object get() {
                return factory2;
            }
        };
        androidx.media3.exoplayer.d dVarA = bVar.a();
        String[] stringArray = requireArguments().getStringArray("playback_url");
        if (stringArray == null) {
            stringArray = new String[0];
        }
        int length = stringArray.length;
        int i4 = 0;
        while (i4 < length) {
            HlsMediaSource hlsMediaSourceE = factory2.c(co6.c(stringArray[i4]));
            dVarA.E0();
            List<bq6> listSingletonList = Collections.singletonList(hlsMediaSourceE);
            dVarA.E0();
            ArrayList arrayList2 = dVarA.p;
            int size = arrayList2.size();
            dVarA.E0();
            xl7.g(size >= 0 ? i3 : i2);
            int iMin = Math.min(size, arrayList2.size());
            if (dVarA.o0.a.p()) {
                dVarA.w0(listSingletonList, dVarA.p0 == -1 ? i3 : i2);
                factory = factory2;
                i = i3;
            } else {
                i28 i28Var = dVarA.o0;
                toa toaVar2 = i28Var.a;
                dVarA.J += i3;
                ArrayList arrayList3 = new ArrayList();
                int i5 = i2;
                i = i3;
                while (i5 < listSingletonList.size()) {
                    i.c cVar = new i.c(listSingletonList.get(i5), dVarA.q);
                    arrayList3.add(cVar);
                    arrayList2.add(i5 + iMin, new androidx.media3.exoplayer.d.C0021d(cVar.b, cVar.a));
                    i5++;
                    factory2 = factory2;
                }
                factory = factory2;
                dVarA.Q = dVarA.Q.f(iMin, arrayList3.size());
                toa n48Var = new n48(dVarA.p, dVarA.Q);
                int iN0 = dVarA.n0(i28Var);
                long jL0 = dVarA.l0(i28Var);
                if (toaVar2.p() || n48Var.p()) {
                    arrayList = arrayList3;
                    toaVar = n48Var;
                    int i6 = (toaVar2.p() || !toaVar.p()) ? 0 : i;
                    int i7 = i6 == 0 ? iN0 : -1;
                    if (i6 != 0) {
                        jL0 = -9223372036854775807L;
                    }
                    pairS0 = dVarA.s0(toaVar, i7, jL0);
                } else {
                    arrayList = arrayList3;
                    pairS0 = toaVar2.i(dVarA.a, dVarA.o, iN0, n6b.N(jL0));
                    Object obj = pairS0.first;
                    if (n48Var.b(obj) != -1) {
                        toaVar = n48Var;
                    } else {
                        int iT = androidx.media3.exoplayer.e.T(dVarA.a, dVarA.o, dVarA.H, dVarA.I, obj, toaVar2, n48Var);
                        toaVar = n48Var;
                        if (iT != -1) {
                            toa.c cVar2 = dVarA.a;
                            toaVar.m(iT, cVar2, 0L);
                            pairS0 = dVarA.s0(toaVar, iT, n6b.Z(cVar2.l));
                        } else {
                            pairS0 = dVarA.s0(toaVar, -1, -9223372036854775807L);
                        }
                    }
                }
                i28 i28VarR0 = dVarA.r0(i28Var, toaVar, pairS0);
                dVarA.l.A.c(18, iMin, new androidx.media3.exoplayer.e.b(arrayList, dVarA.Q, -1, -9223372036854775807L)).b();
                dVarA.C0(i28VarR0, 0, false, 5, -9223372036854775807L, -1, false);
            }
            i4++;
            length = length;
            factory2 = factory;
            i2 = 0;
            i3 = i;
        }
        int i8 = i3;
        PlayerView playerView = p().d;
        playerView.setShowNextButton((stringArray.length == 0 ? i8 : 0) ^ 1);
        playerView.setShowPreviousButton((stringArray.length == 0 ? i8 : 0) ^ 1);
        playerView.setPlayer(dVarA);
        dVarA.n(this.G);
        dVarA.f0(q().z, q().A, false);
        dVarA.d();
        dVarA.h();
        this.A = dVarA;
    }

    public final void s() {
        androidx.media3.exoplayer.d dVar = this.A;
        if (dVar != null) {
            q().A = dVar.X();
            q().z = dVar.G();
            dVar.E0();
            dVar.z0(null);
            ul8 ul8Var = ul8.x;
            long j = dVar.o0.s;
            dVar.e0 = new kc2(ul8Var);
            dVar.a();
        }
        this.A = null;
    }
}
