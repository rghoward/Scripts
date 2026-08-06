package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.hwpo_training_app.R;
import defpackage.aa0;
import defpackage.aw;
import defpackage.ep9;
import defpackage.fva;
import defpackage.gv9;
import defpackage.gva;
import defpackage.ic1;
import defpackage.j73;
import defpackage.ld1;
import defpackage.md1;
import defpackage.od1;
import defpackage.oj5;
import defpackage.xy6;
import defpackage.y20;
import defpackage.yy6;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public float A;
    public final Rect v;
    public final RectF w;
    public final RectF x;
    public final int[] y;
    public float z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(boolean z, View view, View view2) {
            this.a = z;
            this.b = view;
            this.c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            this.b.setVisibility(4);
            View view = this.c;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
                View view = this.c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public xy6 a;
        public gv9 b;
    }

    public FabTransformationBehavior() {
        this.v = new Rect();
        this.w = new RectF();
        this.x = new RectF();
        this.y = new int[2];
    }

    public static float B(b bVar, yy6 yy6Var, float f) {
        long j = yy6Var.a;
        long j2 = yy6Var.b;
        yy6 yy6VarC = bVar.a.c("expansion");
        return aw.a(f, 0.0f, yy6Var.b().getInterpolation((((yy6VarC.a + yy6VarC.b) + 17) - j) / j2));
    }

    public static Pair y(float f, float f2, boolean z, b bVar) {
        yy6 yy6VarC;
        yy6 yy6VarC2;
        if (f == 0.0f || f2 == 0.0f) {
            yy6VarC = bVar.a.c("translationXLinear");
            yy6VarC2 = bVar.a.c("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            yy6VarC = bVar.a.c("translationXCurveDownwards");
            yy6VarC2 = bVar.a.c("translationYCurveDownwards");
        } else {
            yy6VarC = bVar.a.c("translationXCurveUpwards");
            yy6VarC2 = bVar.a.c("translationYCurveUpwards");
        }
        return new Pair(yy6VarC, yy6VarC2);
    }

    public final float A(View view, View view2, gv9 gv9Var) {
        RectF rectF = this.w;
        C(view, rectF);
        rectF.offset(this.z, this.A);
        RectF rectF2 = this.x;
        C(view2, rectF2);
        gv9Var.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.y;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b D(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean f(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        aa0.c("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void g(CoordinatorLayout.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x037a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0144  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat;
        float f;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ArrayList arrayList;
        boolean z3;
        ArrayList arrayList2;
        AnimatorSet animatorSetA;
        int i;
        ObjectAnimator objectAnimatorOfFloat4;
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2;
        b bVarD = D(view2.getContext(), z);
        if (z) {
            this.z = view.getTranslationX();
            this.A = view.getTranslationY();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        bVarD.a.c("elevation").a(objectAnimatorOfFloat);
        arrayList3.add(objectAnimatorOfFloat);
        float fZ = z(view, view2, bVarD.b);
        float fA = A(view, view2, bVarD.b);
        Pair pairY = y(fZ, fA, z, bVarD);
        yy6 yy6Var = (yy6) pairY.first;
        yy6 yy6Var2 = (yy6) pairY.second;
        RectF rectF = this.x;
        Rect rect = this.v;
        RectF rectF2 = this.w;
        if (z) {
            f = 0.0f;
            if (!z2) {
                view2.setTranslationX(-fZ);
                view2.setTranslationY(-fA);
            }
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fB = B(bVarD, yy6Var, -fZ);
            float fB2 = B(bVarD, yy6Var2, -fA);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF2.set(rect);
            C(view2, rectF);
            rectF.offset(fB, fB2);
            rectF.intersect(rectF2);
            rectF2.set(rectF);
            objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
            objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
        } else {
            f = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fZ);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fA);
        }
        yy6Var.a(objectAnimatorOfFloat2);
        yy6Var2.a(objectAnimatorOfFloat3);
        arrayList3.add(objectAnimatorOfFloat2);
        arrayList3.add(objectAnimatorOfFloat3);
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        float fZ2 = z(view, view2, bVarD.b);
        float fA2 = A(view, view2, bVarD.b);
        Pair pairY2 = y(fZ2, fA2, z, bVarD);
        yy6 yy6Var3 = (yy6) pairY2.first;
        yy6 yy6Var4 = (yy6) pairY2.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            fZ2 = this.z;
        }
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fZ2);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            fA2 = this.A;
        }
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fA2);
        yy6Var3.a(objectAnimatorOfFloat7);
        yy6Var4.a(objectAnimatorOfFloat8);
        arrayList3.add(objectAnimatorOfFloat7);
        arrayList3.add(objectAnimatorOfFloat8);
        boolean z4 = view2 instanceof od1;
        if (z4 && (view instanceof ImageView)) {
            od1 od1Var = (od1) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                arrayList = arrayList4;
            } else {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, j73.a, 0);
                } else {
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, j73.a, 255);
                }
                objectAnimatorOfInt2.addUpdateListener(new com.google.android.material.transformation.a(view2));
                bVarD.a.c("iconFade").a(objectAnimatorOfInt2);
                arrayList3.add(objectAnimatorOfInt2);
                com.google.android.material.transformation.b bVar = new com.google.android.material.transformation.b(od1Var, drawable);
                arrayList = arrayList4;
                arrayList.add(bVar);
            }
        } else {
            arrayList = arrayList4;
        }
        if (z4) {
            od1 od1Var2 = (od1) view2;
            gv9 gv9Var = bVarD.b;
            C(view, rectF2);
            rectF2.offset(this.z, this.A);
            C(view2, rectF);
            rectF.offset(-z(view, view2, gv9Var), f);
            float fCenterX = rectF2.centerX() - rectF.left;
            gv9 gv9Var2 = bVarD.b;
            C(view, rectF2);
            rectF2.offset(this.z, this.A);
            C(view2, rectF);
            rectF.offset(0.0f, -A(view, view2, gv9Var2));
            float fCenterY = rectF2.centerY() - rectF.top;
            ((FloatingActionButton) view).g(rect);
            float fWidth2 = rect.width() / 2.0f;
            yy6 yy6VarC = bVarD.a.c("expansion");
            if (z) {
                if (!z2) {
                    od1Var2.setRevealInfo(new od1.d(fCenterX, fCenterY, fWidth2));
                }
                if (z2) {
                    fWidth2 = od1Var2.getRevealInfo().c;
                }
                double d = 0.0f - fCenterX;
                double d2 = 0.0f - fCenterY;
                z3 = z4;
                arrayList2 = arrayList;
                float fHypot = (float) Math.hypot(d, d2);
                double d3 = fWidth - fCenterX;
                float fHypot2 = (float) Math.hypot(d3, d2);
                double d4 = fHeight - fCenterY;
                float fHypot3 = (float) Math.hypot(d3, d4);
                float fHypot4 = (float) Math.hypot(d, d4);
                if (fHypot > fHypot2 && fHypot > fHypot3 && fHypot > fHypot4) {
                    fHypot3 = fHypot;
                } else if (fHypot2 > fHypot3 && fHypot2 > fHypot4) {
                    fHypot3 = fHypot2;
                } else if (fHypot3 <= fHypot4) {
                    fHypot3 = fHypot4;
                }
                animatorSetA = md1.a(od1Var2, fCenterX, fCenterY, fHypot3);
                animatorSetA.addListener(new c(od1Var2));
                long j = yy6VarC.a;
                int i2 = (int) fCenterX;
                int i3 = (int) fCenterY;
                if (j > 0) {
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i2, i3, fWidth2, fWidth2);
                    animatorCreateCircularReveal.setStartDelay(0L);
                    animatorCreateCircularReveal.setDuration(j);
                    arrayList3.add(animatorCreateCircularReveal);
                }
            } else {
                z3 = z4;
                arrayList2 = arrayList;
                float f2 = od1Var2.getRevealInfo().c;
                AnimatorSet animatorSetA2 = md1.a(od1Var2, fCenterX, fCenterY, fWidth2);
                long j2 = yy6VarC.a;
                int i4 = (int) fCenterX;
                int i5 = (int) fCenterY;
                if (j2 > 0) {
                    Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i4, i5, f2, f2);
                    animatorCreateCircularReveal2.setStartDelay(0L);
                    animatorCreateCircularReveal2.setDuration(j2);
                    arrayList3.add(animatorCreateCircularReveal2);
                }
                long j3 = yy6VarC.a;
                long j4 = yy6VarC.b;
                ep9<String, yy6> ep9Var = bVarD.a.a;
                int i6 = 0;
                long jMax = 0;
                for (int i7 = ep9Var.v; i6 < i7; i7 = i7) {
                    yy6 yy6VarJ = ep9Var.j(i6);
                    jMax = Math.max(jMax, yy6VarJ.a + yy6VarJ.b);
                    i6++;
                    ep9Var = ep9Var;
                }
                long j5 = j3 + j4;
                if (j5 < jMax) {
                    Animator animatorCreateCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i4, i5, fWidth2, fWidth2);
                    animatorCreateCircularReveal3.setStartDelay(j5);
                    animatorCreateCircularReveal3.setDuration(jMax - j5);
                    arrayList3.add(animatorCreateCircularReveal3);
                }
                animatorSetA = animatorSetA2;
            }
            yy6VarC.a(animatorSetA);
            arrayList3.add(animatorSetA);
            arrayList = arrayList2;
            arrayList.add(new ld1(od1Var2));
        } else {
            z3 = z4;
        }
        if (z3) {
            od1 od1Var3 = (od1) view2;
            ColorStateList backgroundTintList = view.getBackgroundTintList();
            int colorForState = backgroundTintList != null ? backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor()) : 0;
            int i8 = 16777215 & colorForState;
            if (z) {
                if (!z2) {
                    od1Var3.setCircularRevealScrimColor(colorForState);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(od1Var3, od1.c.a, i8);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(od1Var3, od1.c.a, colorForState);
            }
            objectAnimatorOfInt.setEvaluator(y20.a);
            bVarD.a.c("color").a(objectAnimatorOfInt);
            arrayList3.add(objectAnimatorOfInt);
        }
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = null;
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                }
            } else if ((view2 instanceof gva) || (view2 instanceof fva)) {
                View childAt = ((ViewGroup) view2).getChildAt(0);
                if (childAt instanceof ViewGroup) {
                    viewGroup = (ViewGroup) childAt;
                }
            } else {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup == null) {
                i = 0;
            } else {
                if (z) {
                    if (!z2) {
                        ic1.a.set(viewGroup, Float.valueOf(0.0f));
                    }
                    i = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, ic1.a, 1.0f);
                } else {
                    i = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, ic1.a, 0.0f);
                }
                bVarD.a.c("contentFade").a(objectAnimatorOfFloat4);
                arrayList3.add(objectAnimatorOfFloat4);
            }
        } else {
            i = 0;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        oj5.f(animatorSet, arrayList3);
        animatorSet.addListener(new a(z, view2, view));
        int size = arrayList.size();
        for (int i9 = i; i9 < size; i9++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList.get(i9));
        }
        return animatorSet;
    }

    public final float z(View view, View view2, gv9 gv9Var) {
        RectF rectF = this.w;
        C(view, rectF);
        rectF.offset(this.z, this.A);
        RectF rectF2 = this.x;
        C(view2, rectF2);
        gv9Var.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v = new Rect();
        this.w = new RectF();
        this.x = new RectF();
        this.y = new int[2];
    }
}
