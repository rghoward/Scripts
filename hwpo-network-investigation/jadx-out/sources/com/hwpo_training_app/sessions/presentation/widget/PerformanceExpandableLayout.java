package com.hwpo_training_app.sessions.presentation.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.R;
import defpackage.fs5;
import defpackage.g2b;
import defpackage.l89;
import defpackage.mh4;
import defpackage.mv7;
import defpackage.nv7;
import defpackage.of;
import defpackage.oh4;
import defpackage.ov7;
import defpackage.pv7;
import defpackage.qq2;
import defpackage.wx4;
import defpackage.xgb;
import net.cachapa.expandablelayout.ExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PerformanceExpandableLayout extends wx4 {
    public static final /* synthetic */ int P = 0;
    public mh4<g2b> J;
    public mh4<g2b> K;
    public mh4<g2b> L;
    public oh4<? super Integer, g2b> M;
    public oh4<? super l89, g2b> N;
    public final fs5 O;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends View.BaseSavedState {
        public boolean t;
        public static final b Companion = new b();
        public static final Parcelable.Creator<a> CREATOR = new C0064a();

        /* JADX INFO: renamed from: com.hwpo_training_app.sessions.presentation.widget.PerformanceExpandableLayout$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0064a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                a aVar = new a(parcel);
                aVar.t = parcel.readInt() == 1;
                return aVar;
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.t ? 1 : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceExpandableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        fs5 fs5VarInflate = fs5.inflate(LayoutInflater.from(getContext()), this);
        fs5VarInflate.getClass();
        this.O = fs5VarInflate;
        setRadius(getResources().getDimension(R.dimen.l_radius));
        ExpandableLayout expandableLayout = fs5VarInflate.g;
        expandableLayout.setOnExpansionUpdateListener(new of(this));
        xgb.a(fs5VarInflate.f, new mv7(this, null));
        xgb.a(expandableLayout, new nv7(this, null));
        xgb.a(fs5VarInflate.b, new ov7(this, null));
        xgb.a(fs5VarInflate.c, new pv7(this, null));
    }

    public final void f(boolean z) {
        Context context = getContext();
        if (context != null) {
            this.O.f.setBackground(z ? context.getDrawable(R.drawable.bg_benchmarks_header_expanded) : context.getDrawable(R.drawable.bg_benchmarks_header));
        }
    }

    public final oh4<l89, g2b> getOnAttachmentClick() {
        return this.N;
    }

    public final mh4<g2b> getOnCompleteSessionClick() {
        return this.L;
    }

    public final mh4<g2b> getOnEditBenchmarksClick() {
        return this.K;
    }

    public final mh4<g2b> getOnHeaderBenchmarksClick() {
        return this.J;
    }

    public final oh4<Integer, g2b> getOnLayoutExpanded() {
        return this.M;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        if (aVar.t) {
            fs5 fs5Var = this.O;
            ExpandableLayout expandableLayout = fs5Var.g;
            MaterialButton materialButton = fs5Var.b;
            expandableLayout.b(false, false);
            fs5Var.g.b(true, false);
            materialButton.setVisibility(0);
            materialButton.setAlpha(1.0f);
        }
        f(aVar.t);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.t = this.O.g.a();
        return aVar;
    }

    public final void setOnAttachmentClick(oh4<? super l89, g2b> oh4Var) {
        this.N = oh4Var;
        this.O.d.setOnAttachmentClick(oh4Var);
    }

    public final void setOnCompleteSessionClick(mh4<g2b> mh4Var) {
        this.L = mh4Var;
    }

    public final void setOnEditBenchmarksClick(mh4<g2b> mh4Var) {
        this.K = mh4Var;
    }

    public final void setOnHeaderBenchmarksClick(mh4<g2b> mh4Var) {
        this.J = mh4Var;
    }

    public final void setOnLayoutExpanded(oh4<? super Integer, g2b> oh4Var) {
        this.M = oh4Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PerformanceExpandableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PerformanceExpandableLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ PerformanceExpandableLayout(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
