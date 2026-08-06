package com.hwpo_training_app.benchmarks.presentation.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.benchmarks.presentation.widget.BenchmarksExpandableLayout;
import defpackage.g2b;
import defpackage.jo0;
import defpackage.ko0;
import defpackage.mh4;
import defpackage.oh4;
import defpackage.oq5;
import defpackage.qq2;
import defpackage.vn0;
import defpackage.xgb;
import net.cachapa.expandablelayout.ExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class BenchmarksExpandableLayout extends MaterialCardView {
    public static final /* synthetic */ int M = 0;
    public mh4<g2b> H;
    public mh4<g2b> I;
    public oh4<? super vn0, g2b> J;
    public final oq5 K;
    public float L;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends View.BaseSavedState {
        public float t;
        public boolean u;
        public static final b Companion = new b();
        public static final Parcelable.Creator<a> CREATOR = new C0061a();

        /* JADX INFO: renamed from: com.hwpo_training_app.benchmarks.presentation.widget.BenchmarksExpandableLayout$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0061a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                parcel.getClass();
                a aVar = new a(parcel);
                aVar.t = parcel.readFloat();
                aVar.u = parcel.readInt() == 1;
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
            parcel.writeFloat(this.t);
            parcel.writeInt(this.u ? 1 : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenchmarksExpandableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        oq5 oq5VarInflate = oq5.inflate(LayoutInflater.from(getContext()), this);
        oq5VarInflate.getClass();
        this.K = oq5VarInflate;
        xgb.a(oq5VarInflate.e, new jo0(this, null));
        xgb.a(oq5VarInflate.g, new ko0(this, null));
        oq5VarInflate.f.setOnExpansionUpdateListener(new ExpandableLayout.b() { // from class: do0
            @Override // net.cachapa.expandablelayout.ExpandableLayout.b
            public final void a(int i2) {
                BenchmarksExpandableLayout benchmarksExpandableLayout = this.t;
                oq5 oq5Var = benchmarksExpandableLayout.K;
                int i3 = BenchmarksExpandableLayout.M;
                if (i2 == 2 && benchmarksExpandableLayout.getContext() != null) {
                    oq5Var.e.setBackground(benchmarksExpandableLayout.getContext().getDrawable(R.drawable.bg_benchmarks_header_expanded));
                }
                if (i2 != 0 || benchmarksExpandableLayout.getContext() == null) {
                    return;
                }
                oq5Var.e.setBackground(benchmarksExpandableLayout.getContext().getDrawable(R.drawable.bg_benchmarks_header));
            }
        });
        setRadius(getResources().getDimension(R.dimen.l_radius));
    }

    public final mh4<g2b> getOnEditBenchmarksClick() {
        return this.I;
    }

    public final mh4<g2b> getOnHeaderBenchmarksClick() {
        return this.H;
    }

    public final oh4<vn0, g2b> getOnOpenPersonalRecordsClick() {
        return this.J;
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
        float f = aVar.t;
        this.L = f;
        oq5 oq5Var = this.K;
        oq5Var.g.setAlpha(f);
        oq5Var.g.setVisibility(this.L == 0.0f ? 8 : 0);
        if (aVar.u) {
            oq5Var.f.b(true, false);
        }
        oq5Var.e.setBackground(getContext().getDrawable(aVar.u ? R.drawable.bg_benchmarks_header_expanded : R.drawable.bg_benchmarks_header));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.t = this.L;
        aVar.u = this.K.f.a();
        return aVar;
    }

    public final void setOnEditBenchmarksClick(mh4<g2b> mh4Var) {
        this.I = mh4Var;
    }

    public final void setOnHeaderBenchmarksClick(mh4<g2b> mh4Var) {
        this.H = mh4Var;
    }

    public final void setOnOpenPersonalRecordsClick(oh4<? super vn0, g2b> oh4Var) {
        this.J = oh4Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BenchmarksExpandableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BenchmarksExpandableLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ BenchmarksExpandableLayout(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
