package defpackage;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import com.hwpo_training_app.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qwa {
    public static final qc0 a = new qc0();
    public static final ThreadLocal<WeakReference<n30<ViewGroup, ArrayList<wva>>>> b = new ThreadLocal<>();
    public static final ArrayList<ViewGroup> c = new ArrayList<>();

    public static void a(ViewGroup viewGroup, wva wvaVar) {
        ArrayList<ViewGroup> arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (wvaVar == null) {
            wvaVar = a;
        }
        wva wvaVarClone = wvaVar.clone();
        c(viewGroup, wvaVarClone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        a aVar = new a();
        aVar.t = wvaVarClone;
        aVar.u = viewGroup;
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static n30<ViewGroup, ArrayList<wva>> b() {
        n30<ViewGroup, ArrayList<wva>> n30Var;
        ThreadLocal<WeakReference<n30<ViewGroup, ArrayList<wva>>>> threadLocal = b;
        WeakReference<n30<ViewGroup, ArrayList<wva>>> weakReference = threadLocal.get();
        if (weakReference != null && (n30Var = weakReference.get()) != null) {
            return n30Var;
        }
        n30<ViewGroup, ArrayList<wva>> n30Var2 = new n30<>();
        threadLocal.set(new WeakReference<>(n30Var2));
        return n30Var2;
    }

    public static void c(ViewGroup viewGroup, wva wvaVar) {
        ArrayList<wva> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                wva wvaVar2 = arrayList.get(i);
                i++;
                wvaVar2.z(viewGroup);
            }
        }
        if (wvaVar != null) {
            wvaVar.h(viewGroup, true);
        }
        if (((c49) viewGroup.getTag(R.id.transition_current_scene)) != null) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public wva t;
        public ViewGroup u;

        /* JADX INFO: renamed from: qwa$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class C0229a extends pwa {
            public final /* synthetic */ n30 a;

            public C0229a(n30 n30Var) {
                this.a = n30Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.pwa, wva.f
            public final void a(wva wvaVar) {
                ((ArrayList) this.a.get(a.this.u)).remove(wvaVar);
                wvaVar.B(this);
            }
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0210  */
        /* JADX WARN: Code duplicated, block: B:101:0x021c  */
        /* JADX WARN: Code duplicated, block: B:105:0x0233  */
        /* JADX WARN: Code duplicated, block: B:137:0x02b3  */
        /* JADX WARN: Code duplicated, block: B:139:0x02c3  */
        /* JADX WARN: Code duplicated, block: B:143:0x02e3  */
        /* JADX WARN: Code duplicated, block: B:145:0x02e9  */
        /* JADX WARN: Code duplicated, block: B:147:0x02ef  */
        /* JADX WARN: Code duplicated, block: B:149:0x02fe  */
        /* JADX WARN: Code duplicated, block: B:14:0x004e  */
        /* JADX WARN: Code duplicated, block: B:152:0x0310  */
        /* JADX WARN: Code duplicated, block: B:154:0x0317  */
        /* JADX WARN: Code duplicated, block: B:156:0x031a  */
        /* JADX WARN: Code duplicated, block: B:158:0x0322 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:161:0x01da A[EDGE_INSN: B:161:0x01da->B:88:0x01da BREAK  A[LOOP:1: B:18:0x0082->B:87:0x01d3], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:16:0x0055 A[LOOP:0: B:15:0x0053->B:16:0x0055, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:193:0x01fa A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:20:0x0088  */
        /* JADX WARN: Code duplicated, block: B:210:0x02cb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:212:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:22:0x008c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x008e  */
        /* JADX WARN: Code duplicated, block: B:25:0x0091  */
        /* JADX WARN: Code duplicated, block: B:28:0x0099  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:47:0x0105  */
        /* JADX WARN: Code duplicated, block: B:60:0x0148  */
        /* JADX WARN: Code duplicated, block: B:62:0x0154  */
        /* JADX WARN: Code duplicated, block: B:75:0x0199  */
        /* JADX WARN: Code duplicated, block: B:77:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:91:0x01e1  */
        /* JADX WARN: Code duplicated, block: B:93:0x01ef  */
        /* JADX WARN: Code duplicated, block: B:98:0x0202  */
        /* JADX WARN: Instruction removed from duplicated block: B:147:0x02ef, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ArrayList arrayList;
            int i;
            xwa xwaVar;
            xwa xwaVar2;
            n30 n30Var;
            n30 n30Var2;
            int i2;
            int[] iArr;
            boolean z;
            int i3;
            int i4;
            n30<Animator, wva.b> n30VarR;
            ArrayList arrayList2;
            int i5;
            int i6;
            wva.e eVar;
            int i7;
            wva wvaVar;
            Animator animatorF;
            wva.b bVar;
            wwa wwaVar;
            wwa wwaVar2;
            int i8;
            boolean z2;
            int i9;
            int i10;
            View view;
            wwa wwaVar3;
            n30<String, View> n30Var3;
            int i11;
            int i12;
            View viewJ;
            View view2;
            SparseArray<View> sparseArray;
            int size;
            int i13;
            View viewValueAt;
            View view3;
            we6<View> we6Var;
            int iH;
            int i14;
            View viewI;
            boolean z3;
            int i15;
            int size2;
            int i16;
            wva wvaVar2 = this.t;
            ViewGroup viewGroup = this.u;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            boolean z4 = true;
            if (!qwa.c.remove(viewGroup)) {
                return true;
            }
            n30<ViewGroup, ArrayList<wva>> n30VarB = qwa.b();
            ArrayList<wva> arrayList3 = n30VarB.get(viewGroup);
            if (arrayList3 != null) {
                arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
                arrayList3.add(wvaVar2);
                wvaVar2.a(new C0229a(n30VarB));
                i = 0;
                wvaVar2.h(viewGroup, false);
                if (arrayList != null) {
                    size2 = arrayList.size();
                    i16 = 0;
                    while (i16 < size2) {
                        Object obj = arrayList.get(i16);
                        i16++;
                        ((wva) obj).D(viewGroup);
                    }
                }
                wvaVar2.E = new ArrayList<>();
                wvaVar2.F = new ArrayList<>();
                xwaVar = wvaVar2.A;
                xwaVar2 = wvaVar2.B;
                n30Var = new n30(xwaVar.a);
                n30Var2 = new n30(xwaVar2.a);
                i2 = 0;
                while (true) {
                    iArr = wvaVar2.D;
                    if (i2 < iArr.length) {
                        break;
                    }
                    i8 = iArr[i2];
                    if (i8 != z4) {
                        z2 = z4;
                        i9 = i2;
                        for (i10 = n30Var.v - 1; i10 >= 0; i10--) {
                            view = (View) n30Var.f(i10);
                            if (view == null && wvaVar2.x(view) && (wwaVar3 = (wwa) n30Var2.remove(view)) != null && wvaVar2.x(wwaVar3.b)) {
                                wvaVar2.E.add((wwa) n30Var.h(i10));
                                wvaVar2.F.add(wwaVar3);
                            }
                        }
                    } else if (i8 != 2) {
                        z2 = z4;
                        i9 = i2;
                        n30Var3 = xwaVar.d;
                        n30<String, View> n30Var4 = xwaVar2.d;
                        i11 = n30Var3.v;
                        for (i12 = 0; i12 < i11; i12++) {
                            viewJ = n30Var3.j(i12);
                            if (viewJ == null && wvaVar2.x(viewJ) && (view2 = n30Var4.get(n30Var3.f(i12))) != null && wvaVar2.x(view2)) {
                                wwa wwaVar4 = (wwa) n30Var.get(viewJ);
                                wwa wwaVar5 = (wwa) n30Var2.get(view2);
                                if (wwaVar4 != null && wwaVar5 != null) {
                                    wvaVar2.E.add(wwaVar4);
                                    wvaVar2.F.add(wwaVar5);
                                    n30Var.remove(viewJ);
                                    n30Var2.remove(view2);
                                }
                            }
                        }
                    } else if (i8 != 3) {
                        if (i8 == 4) {
                            we6Var = xwaVar.c;
                            we6<View> we6Var2 = xwaVar2.c;
                            iH = we6Var.h();
                            i14 = i;
                            while (i14 < iH) {
                                viewI = we6Var.i(i14);
                                if (viewI == null && wvaVar2.x(viewI)) {
                                    i15 = i2;
                                    View viewB = we6Var2.b(we6Var.e(i14));
                                    if (viewB == null || !wvaVar2.x(viewB)) {
                                        z3 = z4;
                                    } else {
                                        wwa wwaVar6 = (wwa) n30Var.get(viewI);
                                        z3 = z4;
                                        wwa wwaVar7 = (wwa) n30Var2.get(viewB);
                                        if (wwaVar6 != null && wwaVar7 != null) {
                                            wvaVar2.E.add(wwaVar6);
                                            wvaVar2.F.add(wwaVar7);
                                            n30Var.remove(viewI);
                                            n30Var2.remove(viewB);
                                        }
                                    }
                                } else {
                                    z3 = z4;
                                    i15 = i2;
                                }
                                i14++;
                                i2 = i15;
                                z4 = z3;
                            }
                        }
                        z2 = z4;
                        i9 = i2;
                    } else {
                        z2 = z4;
                        i9 = i2;
                        sparseArray = xwaVar.b;
                        SparseArray<View> sparseArray2 = xwaVar2.b;
                        size = sparseArray.size();
                        for (i13 = 0; i13 < size; i13++) {
                            viewValueAt = sparseArray.valueAt(i13);
                            if (viewValueAt == null && wvaVar2.x(viewValueAt) && (view3 = sparseArray2.get(sparseArray.keyAt(i13))) != null && wvaVar2.x(view3)) {
                                wwa wwaVar8 = (wwa) n30Var.get(viewValueAt);
                                wwa wwaVar9 = (wwa) n30Var2.get(view3);
                                if (wwaVar8 != null && wwaVar9 != null) {
                                    wvaVar2.E.add(wwaVar8);
                                    wvaVar2.F.add(wwaVar9);
                                    n30Var.remove(viewValueAt);
                                    n30Var2.remove(view3);
                                }
                            }
                        }
                    }
                    i2 = i9 + 1;
                    z4 = z2;
                    i = 0;
                }
                z = z4;
                for (i3 = 0; i3 < n30Var.v; i3++) {
                    wwaVar2 = (wwa) n30Var.j(i3);
                    if (wvaVar2.x(wwaVar2.b)) {
                        wvaVar2.E.add(wwaVar2);
                        wvaVar2.F.add(null);
                    }
                }
                for (i4 = 0; i4 < n30Var2.v; i4++) {
                    wwaVar = (wwa) n30Var2.j(i4);
                    if (wvaVar2.x(wwaVar.b)) {
                        wvaVar2.F.add(wwaVar);
                        wvaVar2.E.add(null);
                    }
                }
                n30VarR = wva.r();
                int i17 = n30VarR.v;
                WindowId windowId = viewGroup.getWindowId();
                arrayList2 = new ArrayList();
                i5 = i17 - 1;
                while (i5 >= 0) {
                    animatorF = n30VarR.f(i5);
                    if (animatorF == null && (bVar = n30VarR.get(animatorF)) != null) {
                        wva wvaVar3 = bVar.e;
                        View view4 = bVar.a;
                        if (view4 != null && windowId.equals(bVar.d)) {
                            wwa wwaVar10 = bVar.c;
                            boolean z5 = z;
                            wwa wwaVarT = wvaVar2.t(view4, z5);
                            wwa wwaVarP = wvaVar2.p(view4, z5);
                            if (wwaVarT == null && wwaVarP == null) {
                                wwaVarP = wvaVar2.B.a.get(view4);
                            }
                            if ((wwaVarT != null || wwaVarP != null) && wvaVar3.w(wwaVar10, wwaVarP)) {
                                wva wvaVarQ = wvaVar3.q();
                                ArrayList<Animator> arrayList4 = wvaVar3.H;
                                if (wvaVarQ.S != null) {
                                    animatorF.cancel();
                                    arrayList4.remove(animatorF);
                                    n30VarR.h(i5);
                                    if (arrayList4.size() == 0) {
                                        arrayList2.add(wvaVar3);
                                    }
                                } else if (animatorF.isRunning() || animatorF.isStarted()) {
                                    animatorF.cancel();
                                } else {
                                    n30VarR.h(i5);
                                }
                            }
                        }
                    }
                    i5--;
                    z = true;
                }
                for (i6 = 0; i6 < arrayList2.size(); i6++) {
                    wvaVar = (wva) arrayList2.get(i6);
                    wvaVar.y(wvaVar, wva.g.i, false);
                    if (!wvaVar.L) {
                        wvaVar.L = true;
                        wvaVar.y(wvaVar, wva.g.h, false);
                    }
                }
                wvaVar2.m(viewGroup, wvaVar2.A, wvaVar2.B, wvaVar2.E, wvaVar2.F);
                if (wvaVar2.S == null) {
                    wvaVar2.E();
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    return true;
                }
                wvaVar2.A();
                wva.e eVar2 = wvaVar2.S;
                twa twaVar = eVar2.h;
                long j = twaVar.R == 0 ? 1L : 0L;
                twaVar.F(j, eVar2.a);
                eVar2.a = j;
                eVar = wvaVar2.S;
                eVar.b = true;
                i7 = eVar.d;
                if (i7 == 1) {
                    eVar.d = 0;
                    eVar.h();
                    return true;
                }
                if (i7 == 2) {
                    return true;
                }
                eVar.d = 0;
                eVar.i(eVar.g);
                return true;
            }
            arrayList3 = new ArrayList<>();
            n30VarB.put(viewGroup, arrayList3);
            arrayList3.add(wvaVar2);
            wvaVar2.a(new C0229a(n30VarB));
            i = 0;
            wvaVar2.h(viewGroup, false);
            if (arrayList != null) {
                size2 = arrayList.size();
                i16 = 0;
                while (i16 < size2) {
                    Object obj2 = arrayList.get(i16);
                    i16++;
                    ((wva) obj2).D(viewGroup);
                }
            }
            wvaVar2.E = new ArrayList<>();
            wvaVar2.F = new ArrayList<>();
            xwaVar = wvaVar2.A;
            xwaVar2 = wvaVar2.B;
            n30Var = new n30(xwaVar.a);
            n30Var2 = new n30(xwaVar2.a);
            i2 = 0;
            while (true) {
                iArr = wvaVar2.D;
                if (i2 < iArr.length) {
                    break;
                    break;
                }
                i8 = iArr[i2];
                if (i8 != z4) {
                    z2 = z4;
                    i9 = i2;
                    while (i10 >= 0) {
                        view = (View) n30Var.f(i10);
                        if (view == null) {
                        }
                    }
                } else if (i8 != 2) {
                    z2 = z4;
                    i9 = i2;
                    n30Var3 = xwaVar.d;
                    n30<String, View> n30Var5 = xwaVar2.d;
                    i11 = n30Var3.v;
                    while (i12 < i11) {
                        viewJ = n30Var3.j(i12);
                        if (viewJ == null) {
                        }
                    }
                } else if (i8 != 3) {
                    if (i8 == 4) {
                        we6Var = xwaVar.c;
                        we6<View> we6Var3 = xwaVar2.c;
                        iH = we6Var.h();
                        i14 = i;
                        while (i14 < iH) {
                            viewI = we6Var.i(i14);
                            if (viewI == null) {
                                z3 = z4;
                                i15 = i2;
                            } else {
                                z3 = z4;
                                i15 = i2;
                            }
                            i14++;
                            i2 = i15;
                            z4 = z3;
                        }
                    }
                    z2 = z4;
                    i9 = i2;
                } else {
                    z2 = z4;
                    i9 = i2;
                    sparseArray = xwaVar.b;
                    SparseArray<View> sparseArray3 = xwaVar2.b;
                    size = sparseArray.size();
                    while (i13 < size) {
                        viewValueAt = sparseArray.valueAt(i13);
                        if (viewValueAt == null) {
                        }
                    }
                }
                i2 = i9 + 1;
                z4 = z2;
                i = 0;
            }
            z = z4;
            while (i3 < n30Var.v) {
                wwaVar2 = (wwa) n30Var.j(i3);
                if (wvaVar2.x(wwaVar2.b)) {
                    wvaVar2.E.add(wwaVar2);
                    wvaVar2.F.add(null);
                }
            }
            while (i4 < n30Var2.v) {
                wwaVar = (wwa) n30Var2.j(i4);
                if (wvaVar2.x(wwaVar.b)) {
                    wvaVar2.F.add(wwaVar);
                    wvaVar2.E.add(null);
                }
            }
            n30VarR = wva.r();
            int i18 = n30VarR.v;
            WindowId windowId2 = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            i5 = i18 - 1;
            while (i5 >= 0) {
                animatorF = n30VarR.f(i5);
                if (animatorF == null) {
                }
                i5--;
                z = true;
            }
            while (i6 < arrayList2.size()) {
                wvaVar = (wva) arrayList2.get(i6);
                wvaVar.y(wvaVar, wva.g.i, false);
                if (!wvaVar.L) {
                    wvaVar.L = true;
                    wvaVar.y(wvaVar, wva.g.h, false);
                }
            }
            wvaVar2.m(viewGroup, wvaVar2.A, wvaVar2.B, wvaVar2.E, wvaVar2.F);
            if (wvaVar2.S == null) {
                wvaVar2.E();
                return true;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                return true;
            }
            wvaVar2.A();
            wva.e eVar3 = wvaVar2.S;
            twa twaVar2 = eVar3.h;
            if (twaVar2.R == 0) {
            }
            twaVar2.F(j, eVar3.a);
            eVar3.a = j;
            eVar = wvaVar2.S;
            eVar.b = true;
            i7 = eVar.d;
            if (i7 == 1) {
                eVar.d = 0;
                eVar.h();
                return true;
            }
            if (i7 == 2) {
                return true;
            }
            eVar.d = 0;
            eVar.i(eVar.g);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.u;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            qwa.c.remove(viewGroup);
            ArrayList<wva> arrayList = qwa.b().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    wva wvaVar = arrayList.get(i);
                    i++;
                    wvaVar.D(viewGroup);
                }
            }
            this.t.i(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
