package com.hwpo_training_app.leaderboards.common.presentation.dialog.athlete_results;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.common.presentation.dialog.athlete_results.adapter.SimpleResultsAdapter;
import com.hwpo_training_app.leaderboards.common.presentation.entity.SimpleAthleteResultUiEntity;
import com.hwpo_training_app.leaderboards.databinding.DialogResultsBinding;
import defpackage.eeb;
import defpackage.ho5;
import defpackage.ne8;
import defpackage.oh4;
import defpackage.th1;
import defpackage.vg4;
import defpackage.wk6;
import defpackage.xgb;
import defpackage.xj5;
import defpackage.z90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ResultsDialogFragment extends e {
    public final vg4 J;
    public final SimpleResultsAdapter K;
    public static final /* synthetic */ ho5<Object>[] L = {new ne8(ResultsDialogFragment.class, "binding", "getBinding()Lcom/hwpo_training_app/leaderboards/databinding/DialogResultsBinding;", 0)};
    public static final Companion Companion = new Companion(0);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Params implements Parcelable {
        public static final Parcelable.Creator<Params> CREATOR = new Creator();
        public final String t;
        public final List<SimpleAthleteResultUiEntity> u;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Creator implements Parcelable.Creator<Params> {
            @Override // android.os.Parcelable.Creator
            public final Params createFromParcel(Parcel parcel) {
                parcel.getClass();
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SimpleAthleteResultUiEntity.CREATOR.createFromParcel(parcel));
                }
                return new Params(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Params[] newArray(int i) {
                return new Params[i];
            }
        }

        public Params(String str, List<SimpleAthleteResultUiEntity> list) {
            str.getClass();
            list.getClass();
            this.t = str;
            this.u = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return xj5.a(this.t, params.t) && xj5.a(this.u, params.u);
        }

        public final int hashCode() {
            return this.u.hashCode() + (this.t.hashCode() * 31);
        }

        public final String toString() {
            return "Params(primaryResultText=" + this.t + ", simpleAdditionalResults=" + this.u + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.t);
            List<SimpleAthleteResultUiEntity> list = this.u;
            parcel.writeInt(list.size());
            Iterator<SimpleAthleteResultUiEntity> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
    }

    public ResultsDialogFragment() {
        super(R.layout.dialog_results);
        this.J = new vg4(new oh4<ResultsDialogFragment, DialogResultsBinding>() { // from class: com.hwpo_training_app.leaderboards.common.presentation.dialog.athlete_results.ResultsDialogFragment$special$$inlined$viewBindingFragment$default$1
            @Override // defpackage.oh4
            public final DialogResultsBinding invoke(ResultsDialogFragment resultsDialogFragment) {
                ResultsDialogFragment resultsDialogFragment2 = resultsDialogFragment;
                resultsDialogFragment2.getClass();
                return DialogResultsBinding.bind(resultsDialogFragment2.requireView());
            }
        });
        this.K = new SimpleResultsAdapter();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        Parcelable parcelable;
        Window window;
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle bundleRequireArguments = requireArguments();
        bundleRequireArguments.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) bundleRequireArguments.getParcelable("ARG_PARAMS", Params.class);
        } else {
            Parcelable parcelable2 = bundleRequireArguments.getParcelable("ARG_PARAMS");
            if (!(parcelable2 instanceof Params)) {
                parcelable2 = null;
            }
            parcelable = (Params) parcelable2;
        }
        if (parcelable == null) {
            z90.a("Required value was null.");
            return;
        }
        Params params = (Params) parcelable;
        String str = params.t;
        List<SimpleAthleteResultUiEntity> list = params.u;
        T tA = this.J.a(this, L[0]);
        tA.getClass();
        DialogResultsBinding dialogResultsBinding = (DialogResultsBinding) tA;
        RecyclerView recyclerView = dialogResultsBinding.e;
        Dialog dialog = this.E;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(getResources().getDisplayMetrics().widthPixels - (wk6.b(getResources().getDimension(R.dimen.default_margin)) * 2), -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialogResultsBinding.d.setText(str);
        int iB = wk6.b(getResources().getDimension(R.dimen.default_margin_small));
        SimpleResultsAdapter simpleResultsAdapter = this.K;
        recyclerView.setAdapter(simpleResultsAdapter);
        recyclerView.h(new eeb(0, 0, 0, iB));
        simpleResultsAdapter.u(th1.T(list));
        xgb.a(dialogResultsBinding.b, new ResultsDialogFragment$setupDialog$1$2(this, null));
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
