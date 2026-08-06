package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h81 extends wva {
    public static final String[] Y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final a Z = new a(PointF.class, "topLeft");
    public static final b a0 = new b(PointF.class, "bottomRight");
    public static final c b0 = new c(PointF.class, "bottomRight");
    public static final d c0 = new d(PointF.class, "topLeft");
    public static final e d0 = new e(PointF.class, "position");

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends Property<h, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(h hVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(h hVar, PointF pointF) {
            h hVar2 = hVar;
            PointF pointF2 = pointF;
            hVar2.getClass();
            hVar2.a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            hVar2.b = iRound;
            int i = hVar2.f + 1;
            hVar2.f = i;
            if (i == hVar2.g) {
                zib.a(hVar2.e, hVar2.a, iRound, hVar2.c, hVar2.d);
                hVar2.f = 0;
                hVar2.g = 0;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b extends Property<h, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(h hVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(h hVar, PointF pointF) {
            h hVar2 = hVar;
            PointF pointF2 = pointF;
            hVar2.getClass();
            hVar2.c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            hVar2.d = iRound;
            int i = hVar2.g + 1;
            hVar2.g = i;
            if (hVar2.f == i) {
                zib.a(hVar2.e, hVar2.a, hVar2.b, hVar2.c, iRound);
                hVar2.f = 0;
                hVar2.g = 0;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            zib.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            zib.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class e extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            zib.a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class f extends AnimatorListenerAdapter {
        private final h mViewBounds;

        public f(h hVar) {
            this.mViewBounds = hVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class g extends pwa {
        public boolean a = false;
        public final ViewGroup b;

        public g(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // defpackage.pwa, wva.f
        public final void a(wva wvaVar) {
            if (!this.a) {
                dhb.a(this.b, false);
            }
            wvaVar.B(this);
        }

        @Override // defpackage.pwa, wva.f
        public final void d() {
            dhb.a(this.b, false);
        }

        @Override // defpackage.pwa, wva.f
        public final void k() {
            dhb.a(this.b, true);
        }

        @Override // defpackage.pwa, wva.f
        public final void l(wva wvaVar) {
            dhb.a(this.b, false);
            this.a = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class h {
        public int a;
        public int b;
        public int c;
        public int d;
        public final View e;
        public int f;
        public int g;

        public h(View view) {
            this.e = view;
        }
    }

    public static void O(wwa wwaVar) {
        View view = wwaVar.b;
        HashMap map = wwaVar.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.wva
    public final void d(wwa wwaVar) {
        O(wwaVar);
    }

    @Override // defpackage.wva
    public final void g(wwa wwaVar) {
        O(wwaVar);
    }

    @Override // defpackage.wva
    public final Animator l(ViewGroup viewGroup, wwa wwaVar, wwa wwaVar2) {
        int i;
        h81 h81Var;
        Animator animatorOfObject;
        if (wwaVar == null) {
            return null;
        }
        HashMap map = wwaVar.a;
        if (wwaVar2 == null) {
            return null;
        }
        HashMap map2 = wwaVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = wwaVar2.b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        zib.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            h81Var = this;
            animatorOfObject = (i2 == i3 && i4 == i5) ? ObjectAnimator.ofObject(view, b0, (TypeConverter) null, h81Var.Q.N0(i6, i8, i7, i9)) : ObjectAnimator.ofObject(view, c0, (TypeConverter) null, h81Var.Q.N0(i2, i4, i3, i5));
        } else if (i10 == i12 && i11 == i13) {
            h81Var = this;
            animatorOfObject = ObjectAnimator.ofObject(view, d0, (TypeConverter) null, h81Var.Q.N0(i2, i4, i3, i5));
        } else {
            h81Var = this;
            h hVar = new h(view);
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(hVar, Z, (TypeConverter) null, h81Var.Q.N0(i2, i4, i3, i5));
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(hVar, a0, (TypeConverter) null, h81Var.Q.N0(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
            animatorSet.addListener(new f(hVar));
            animatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            dhb.a(viewGroup4, true);
            h81Var.q().a(new g(viewGroup4));
        }
        return animatorOfObject;
    }

    @Override // defpackage.wva
    public final String[] s() {
        return Y;
    }
}
