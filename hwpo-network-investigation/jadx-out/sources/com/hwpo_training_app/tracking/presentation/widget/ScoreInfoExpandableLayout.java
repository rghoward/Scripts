package com.hwpo_training_app.tracking.presentation.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.tracking.presentation.widget.ScoreInfoExpandableLayout;
import defpackage.ac4;
import defpackage.g2b;
import defpackage.is5;
import defpackage.jw3;
import defpackage.l89;
import defpackage.mh4;
import defpackage.o7a;
import defpackage.oh4;
import defpackage.p86;
import defpackage.q59;
import defpackage.qq2;
import defpackage.r59;
import defpackage.s59;
import defpackage.t59;
import defpackage.wm6;
import defpackage.ws0;
import defpackage.xgb;
import defpackage.xo4;
import defpackage.yb5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ScoreInfoExpandableLayout extends MaterialCardView {
    public static final /* synthetic */ int N = 0;
    public mh4<g2b> H;
    public mh4<g2b> I;
    public oh4<? super l89, g2b> J;
    public final is5 K;
    public final o7a L;
    public final o7a M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScoreInfoExpandableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        is5 is5VarInflate = is5.inflate(LayoutInflater.from(getContext()), this);
        is5VarInflate.getClass();
        this.K = is5VarInflate;
        this.L = new o7a(new q59(0, this));
        this.M = new o7a(new yb5(2, this));
        setRadius(getResources().getDimension(R.dimen.l_radius));
        setElevation(context.getResources().getDimension(R.dimen.elevation_big_element));
        xo4 xo4Var = new xo4((int) getResources().getDimension(R.dimen.default_margin), 2);
        RecyclerView recyclerView = is5VarInflate.h;
        recyclerView.setLayoutManager(new GridLayoutManager(context, 2));
        recyclerView.h(xo4Var);
        recyclerView.setAdapter(getMediaAttachmentsAdapter());
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = is5VarInflate.g;
        recyclerView2.setLayoutManager(new GridLayoutManager(context, 2));
        recyclerView2.h(xo4Var);
        recyclerView2.setAdapter(getFileAttachmentsAdapter());
        recyclerView2.setItemAnimator(null);
        xgb.a(is5VarInflate.i, new r59(this, null));
        xgb.a(is5VarInflate.b, new s59(this, null));
    }

    private final jw3 getFileAttachmentsAdapter() {
        return (jw3) this.M.getValue();
    }

    private final wm6 getMediaAttachmentsAdapter() {
        return (wm6) this.L.getValue();
    }

    public final void f(boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 1.0f : 0.0f, z ? 0.0f : 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: n59
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = ScoreInfoExpandableLayout.N;
                valueAnimator.getClass();
                ImageView imageView = this.a.K.e;
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                imageView.setAlpha(((Float) animatedValue).floatValue());
            }
        });
        valueAnimatorOfFloat.start();
    }

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
    public final void g(t59 t59Var) {
        t59Var.getClass();
        boolean z = t59Var.a;
        is5 is5Var = this.K;
        View view = is5Var.a;
        MaterialTextView materialTextView = is5Var.d;
        view.getClass();
        int i = 0;
        view.setVisibility(z ? 0 : 8);
        is5Var.h.setVisibility(t59Var.b ? 0 : 8);
        is5Var.g.setVisibility(t59Var.c ? 0 : 8);
        materialTextView.setText(t59Var.d);
        p86.Companion.getClass();
        materialTextView.setMovementMethod((p86) p86.a.getValue());
        List<String> list = t59Var.e;
        LinearLayoutCompat linearLayoutCompat = is5Var.j;
        linearLayoutCompat.removeAllViews();
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                ws0.m();
                throw null;
            }
            TextView textView = (TextView) xgb.e(linearLayoutCompat, R.layout.layout_score_description);
            textView.setText((String) obj);
            if (i != 0) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    ac4.c("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = (int) linearLayoutCompat.getResources().getDimension(R.dimen.score_description_text_margin);
                    textView.setLayoutParams(marginLayoutParams);
                }
            }
            linearLayoutCompat.addView(textView);
            i = i2;
        }
        getMediaAttachmentsAdapter().u(t59Var.f);
        getFileAttachmentsAdapter().u(t59Var.g);
    }

    public final oh4<l89, g2b> getOnAttachmentClick() {
        return this.J;
    }

    public final mh4<g2b> getOnExpandActionClick() {
        return this.H;
    }

    public final mh4<g2b> getOnOpenLeaderboardClick() {
        return this.I;
    }

    public final void setOnAttachmentClick(oh4<? super l89, g2b> oh4Var) {
        this.J = oh4Var;
    }

    public final void setOnExpandActionClick(mh4<g2b> mh4Var) {
        this.H = mh4Var;
    }

    public final void setOnOpenLeaderboardClick(mh4<g2b> mh4Var) {
        this.I = mh4Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScoreInfoExpandableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScoreInfoExpandableLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ScoreInfoExpandableLayout(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
