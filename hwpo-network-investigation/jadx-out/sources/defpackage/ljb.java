package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.hwpo_training_app.R;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ljb extends wva {
    public static final String[] Z = {"android:visibility:visibility", "android:visibility:parent"};
    public int Y = 3;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    public static void O(wwa wwaVar) {
        View view = wwaVar.b;
        int visibility = view.getVisibility();
        HashMap map = wwaVar.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static c P(wwa wwaVar, wwa wwaVar2) {
        c cVar = new c();
        cVar.a = false;
        cVar.b = false;
        if (wwaVar != null) {
            HashMap map = wwaVar.a;
            if (map.containsKey("android:visibility:visibility")) {
                cVar.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                cVar.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                cVar.c = -1;
                cVar.e = null;
            }
        } else {
            cVar.c = -1;
            cVar.e = null;
        }
        if (wwaVar2 != null) {
            HashMap map2 = wwaVar2.a;
            if (map2.containsKey("android:visibility:visibility")) {
                cVar.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                cVar.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                cVar.d = -1;
                cVar.f = null;
            }
        } else {
            cVar.d = -1;
            cVar.f = null;
        }
        if (wwaVar != null && wwaVar2 != null) {
            int i = cVar.c;
            int i2 = cVar.d;
            if (i != i2 || cVar.e != cVar.f) {
                if (i != i2) {
                    if (i == 0) {
                        cVar.b = false;
                        cVar.a = true;
                        return cVar;
                    }
                    if (i2 == 0) {
                        cVar.b = true;
                        cVar.a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f == null) {
                        cVar.b = false;
                        cVar.a = true;
                        return cVar;
                    }
                    if (cVar.e == null) {
                        cVar.b = true;
                        cVar.a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (wwaVar == null && cVar.d == 0) {
                cVar.b = true;
                cVar.a = true;
                return cVar;
            }
            if (wwaVar2 == null && cVar.c == 0) {
                cVar.b = false;
                cVar.a = true;
            }
        }
        return cVar;
    }

    @Override // defpackage.wva
    public final void d(wwa wwaVar) {
        O(wwaVar);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0142  */
    /* JADX WARN: Code duplicated, block: B:65:0x014a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0160  */
    /* JADX WARN: Code duplicated, block: B:69:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0214  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (P(p(r3, false), t(r3, false)).a != false) goto L9;
     */
    @Override // defpackage.wva
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator l(android.view.ViewGroup r25, defpackage.wwa r26, defpackage.wwa r27) {
        /*
            Method dump skipped, instruction units count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljb.l(android.view.ViewGroup, wwa, wwa):android.animation.Animator");
    }

    @Override // defpackage.wva
    public final String[] s() {
        return Z;
    }

    @Override // defpackage.wva
    public final boolean w(wwa wwaVar, wwa wwaVar2) {
        if (wwaVar == null && wwaVar2 == null) {
            return false;
        }
        if (wwaVar != null && wwaVar2 != null && wwaVar2.a.containsKey("android:visibility:visibility") != wwaVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarP = P(wwaVar, wwaVar2);
        if (cVarP.a) {
            return cVarP.c == 0 || cVarP.d == 0;
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends AnimatorListenerAdapter implements wva.f {
        public final ViewGroup a;
        public final View b;
        public final View c;
        public boolean d = true;

        public b(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        @Override // wva.f
        public final void a(wva wvaVar) {
            wvaVar.B(this);
        }

        public final void b() {
            this.c.setTag(R.id.save_overlay_view, null);
            this.a.getOverlay().remove(this.b);
            this.d = false;
        }

        @Override // wva.f
        public final void l(wva wvaVar) {
            if (this.d) {
                b();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.a.getOverlay().remove(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.b;
            if (view.getParent() == null) {
                egb.a(view, this.a);
            } else {
                ljb.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                View view = this.c;
                View view2 = this.b;
                view.setTag(R.id.save_overlay_view, view2);
                egb.a(view2, this.a);
                this.d = true;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            b();
        }

        @Override // wva.f
        public final void d() {
        }

        @Override // wva.f
        public final void k() {
        }

        @Override // wva.f
        public final void e(wva wvaVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends AnimatorListenerAdapter implements wva.f {
        public final View a;
        public final int b;
        public final ViewGroup c;
        public boolean e;
        public boolean f = false;
        public final boolean d = true;

        public a(int i, View view) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            b(true);
        }

        @Override // wva.f
        public final void a(wva wvaVar) {
            wvaVar.B(this);
        }

        public final void b(boolean z) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.c) == null) {
                return;
            }
            this.e = z;
            dhb.a(viewGroup, z);
        }

        @Override // wva.f
        public final void d() {
            b(false);
            if (this.f) {
                return;
            }
            zib.b(this.b, this.a);
        }

        @Override // wva.f
        public final void k() {
            b(true);
            if (this.f) {
                return;
            }
            zib.b(0, this.a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            if (!this.f) {
                zib.b(this.b, this.a);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                zib.b(0, this.a);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // wva.f
        public final void e(wva wvaVar) {
        }

        @Override // wva.f
        public final void l(wva wvaVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f) {
                zib.b(this.b, this.a);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }
    }
}
