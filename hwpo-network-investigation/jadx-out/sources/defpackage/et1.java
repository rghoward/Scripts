package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.hwpo_training_app.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class et1 {
    public final View a;
    public final yt1 b;
    public final m76 c;
    public final f19 d;
    public final whb e;
    public final o85 f;
    public final wt8 g;
    public final Configuration h;
    public final h37<Configuration> i;
    public final ck j;
    public final us k;
    public final tl l;
    public final sl m;
    public final pa4 n;
    public final h37<qa4.a> o;
    public final st4 p;
    public final ys q;
    public final tr5 r;
    public final l26 s;
    public final u41 t;
    public int u;
    public final ft1 v;
    public final gt1 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<c33, b33> {
        public final /* synthetic */ f33 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f33 f33Var) {
            super(1);
            this.u = f33Var;
        }

        @Override // defpackage.oh4
        public final b33 invoke(c33 c33Var) {
            return new dt1(this.u);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ cm u;
        public final /* synthetic */ et1 v;
        public final /* synthetic */ ci4<jt1, Integer, g2b> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(cm cmVar, et1 et1Var, ci4<? super jt1, ? super Integer, g2b> ci4Var) {
            super(2);
            this.u = cmVar;
            this.v = et1Var;
            this.w = ci4Var;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                jt1Var2.K(866651995);
                qu1.a(this.u, this.v.k, this.w, jt1Var2, 0);
                jt1Var2.B();
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ cm v;
        public final /* synthetic */ ci4<jt1, Integer, g2b> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(cm cmVar, ci4<? super jt1, ? super Integer, g2b> ci4Var, int i) {
            super(2);
            this.v = cmVar;
            this.w = ci4Var;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            num.intValue();
            int iS = gz3.s(1);
            et1.this.a(this.v, this.w, jt1Var, iS);
            return g2b.a;
        }
    }

    public et1(et1 et1Var, View view, yt1 yt1Var, m76 m76Var, f19 f19Var, whb whbVar) {
        o85 o85Var;
        Configuration configuration;
        h37<Configuration> h37VarI;
        ck ckVar;
        us usVar;
        tl tlVar;
        sl slVar;
        pa4 koVar;
        h37<qa4.a> dt7Var;
        ys ysVar;
        u41 u41Var;
        tr5 tr5Var;
        wt8 wt8Var;
        View view2;
        boolean zA = xj5.a((et1Var == null || (view2 = et1Var.a) == null) ? null : view2.getContext(), view.getContext());
        this.a = view;
        this.b = yt1Var;
        this.c = m76Var;
        this.d = f19Var;
        this.e = whbVar;
        if (zA) {
            et1Var.getClass();
            o85Var = et1Var.f;
        } else {
            o85Var = new o85();
        }
        this.f = o85Var;
        this.g = (et1Var == null || (wt8Var = et1Var.g) == null) ? new wt8() : wt8Var;
        if (zA) {
            et1Var.getClass();
            configuration = et1Var.h;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.h = configuration;
        if (zA) {
            et1Var.getClass();
            h37VarI = et1Var.i;
        } else {
            h37VarI = bl7.i(new Configuration(configuration));
        }
        this.i = h37VarI;
        if (zA) {
            et1Var.getClass();
            ckVar = et1Var.j;
        } else {
            ckVar = new ck(view.getContext());
        }
        this.j = ckVar;
        if (zA) {
            et1Var.getClass();
            usVar = et1Var.k;
        } else {
            usVar = new us(view.getContext());
        }
        this.k = usVar;
        if (zA) {
            et1Var.getClass();
            tlVar = et1Var.l;
        } else {
            tlVar = new tl(view.getContext());
        }
        this.l = tlVar;
        if (zA) {
            et1Var.getClass();
            slVar = et1Var.m;
        } else {
            slVar = new sl(tlVar);
        }
        this.m = slVar;
        if (zA) {
            et1Var.getClass();
            koVar = et1Var.n;
        } else {
            view.getContext();
            koVar = new ko();
        }
        this.n = koVar;
        if (zA) {
            et1Var.getClass();
            dt7Var = et1Var.o;
        } else {
            dt7Var = new dt7(va4.a(view.getContext()), jl8.u);
        }
        this.o = dt7Var;
        this.p = view == (et1Var != null ? et1Var.a : null) ? et1Var.p : new s08(view);
        if (zA) {
            et1Var.getClass();
            ysVar = et1Var.q;
        } else {
            ysVar = new ys(ViewConfiguration.get(view.getContext()));
        }
        this.q = ysVar;
        this.r = (et1Var == null || (tr5Var = et1Var.r) == null) ? new tr5() : tr5Var;
        this.s = new l26();
        this.t = (et1Var == null || (u41Var = et1Var.t) == null) ? new u41() : u41Var;
        this.v = new ft1(this);
        this.w = new gt1(this);
    }

    public final void a(cm cmVar, ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, int i) {
        boolean z;
        bj4 bj4VarO = jt1Var.o(123858079);
        int i2 = (bj4VarO.j(cmVar) ? 4 : 2) | i | (bj4VarO.j(ci4Var) ? 32 : 16) | (bj4VarO.j(this) ? 256 : 128);
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            Object tag = cmVar.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof zn5) && !(tag instanceof do5))) ? null : (Set) tag;
            if (set == null) {
                Object parent = cmVar.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof zn5) && !(tag2 instanceof do5))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(bj4VarO.a0());
                bj4VarO.q = true;
                bj4VarO.C = true;
                bj4VarO.c.i1();
                bj4VarO.H.i1();
                cs9 cs9Var = bj4VarO.I;
                zr9 zr9Var = cs9Var.a;
                cs9Var.e = zr9Var.G;
                cs9Var.f = zr9Var.H;
            }
            Object objF = bj4VarO.f();
            f19 f19Var = this.d;
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                Object parent2 = cmVar.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                String strA = ct1.a("SaveableStateRegistry:", strValueOf);
                b19 savedStateRegistry = f19Var.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(strA);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str, parcelableArrayList);
                    }
                }
                i33 i33Var = i33.v;
                y0a y0aVar = o09.a;
                final n09 n09Var = new n09(linkedHashMap, i33Var);
                if (savedStateRegistry.b(strA) != null) {
                    z = false;
                } else {
                    try {
                        savedStateRegistry.c(strA, new b19.b() { // from class: g33
                            @Override // b19.b
                            public final Bundle a() {
                                Map<String, List<Object>> mapC = n09Var.c();
                                Bundle bundle = new Bundle();
                                for (Map.Entry<String, List<Object>> entry : mapC.entrySet()) {
                                    String key = entry.getKey();
                                    List<Object> value = entry.getValue();
                                    bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
                                }
                                return bundle;
                            }
                        });
                        z = true;
                    } catch (IllegalArgumentException unused) {
                        z = false;
                    }
                }
                f33 f33Var = new f33(n09Var, new h33(z, savedStateRegistry, strA));
                bj4VarO.C(f33Var);
                objF = f33Var;
            }
            f33 f33Var2 = (f33) objF;
            g2b g2bVar = g2b.a;
            boolean zJ = bj4VarO.j(f33Var2);
            Object objF2 = bj4VarO.f();
            if (zJ || objF2 == c0187a) {
                objF2 = new a(f33Var2);
                bj4VarO.C(objF2);
            }
            wd3.a(g2bVar, (oh4) objF2, bj4VarO);
            u93 u93Var = qu1.w;
            boolean zBooleanValue = ((Boolean) bj4VarO.F(u93Var)).booleanValue() | cmVar.getScrollCaptureInProgress$ui();
            boolean zJ2 = bj4VarO.J(cmVar.getView());
            Object objF3 = bj4VarO.f();
            if (zJ2 || objF3 == c0187a) {
                objF3 = new uib(cmVar.getView());
                bj4VarO.C(objF3);
            }
            nu1.b(new kf8[]{kc6.a.a(this.c), uc6.a.a(f19Var), AndroidCompositionLocals_androidKt.d.a(this.f), AndroidCompositionLocals_androidKt.e.a(this.g), AndroidCompositionLocals_androidKt.b.a(cmVar.getContext()), oe5.a.a(set), AndroidCompositionLocals_androidKt.a.a(cmVar.getConfiguration()), o09.a.a(f33Var2), AndroidCompositionLocals_androidKt.f.a(cmVar.getView()), u93Var.a(Boolean.valueOf(zBooleanValue)), qu1.t.a(cmVar.getViewConfiguration()), x25.a.a((uib) objF3)}, gr1.b(1317454175, new b(cmVar, this, ci4Var), bj4VarO), bj4VarO, 56);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new c(cmVar, ci4Var, i);
        }
    }

    public final void b() {
        int i = this.u - 1;
        this.u = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.u = 0;
        }
        if (this.u == 0) {
            View view = this.a;
            Context context = view.getContext();
            gt1 gt1Var = this.w;
            context.unregisterComponentCallbacks(gt1Var);
            l26 l26Var = this.s;
            l26Var.getClass();
            l26Var.a = null;
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(gt1Var);
        }
    }

    public final void c() {
        int i = this.u + 1;
        this.u = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            gt1 gt1Var = this.w;
            context.registerComponentCallbacks(gt1Var);
            d(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            l26 l26Var = this.s;
            l26Var.b.setValue(Boolean.valueOf(zHasWindowFocus));
            l26Var.a = this.v;
            view.getViewTreeObserver().addOnWindowFocusChangeListener(gt1Var);
        }
    }

    public final void d(Configuration configuration) {
        int iUpdateFrom = this.h.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator<Map.Entry<o85.b, WeakReference<o85.a>>> it = this.f.a.entrySet().iterator();
            while (it.hasNext()) {
                o85.a aVar = it.next().getValue().get();
                if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.b)) {
                    it.remove();
                }
            }
            this.i.setValue(new Configuration(configuration));
            this.g.a();
            if ((268435456 & iUpdateFrom) != 0) {
                this.o.setValue(va4.a(this.a.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                this.s.getClass();
            }
        }
    }
}
