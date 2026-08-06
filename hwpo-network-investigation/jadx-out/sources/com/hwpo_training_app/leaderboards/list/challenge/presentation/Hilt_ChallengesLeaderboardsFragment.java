package com.hwpo_training_app.leaderboards.list.challenge.presentation;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListFragment;
import defpackage.bk4;
import defpackage.dx0;
import defpackage.ggb;
import defpackage.ke4;
import defpackage.rv2;
import defpackage.te4;
import defpackage.thb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
abstract class Hilt_ChallengesLeaderboardsFragment extends BaseLeaderboardsListFragment implements bk4 {
    public ggb.a A;
    public volatile ke4 C;
    public boolean B = false;
    public final Object D = new Object();
    public boolean E = false;

    @Override // defpackage.ak4
    public final Object a() {
        if (this.C == null) {
            synchronized (this.D) {
                try {
                    if (this.C == null) {
                        this.C = new ke4(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.C.a();
    }

    @Override // androidx.fragment.app.f
    public final Context getContext() {
        if (super.getContext() == null && !this.B) {
            return null;
        }
        q();
        return this.A;
    }

    @Override // androidx.fragment.app.f, defpackage.wt4
    public final thb.c getDefaultViewModelProviderFactory() {
        return rv2.a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.f
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ggb.a aVar = this.A;
        dx0.b(aVar == null || ke4.c(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        q();
        if (this.E) {
            return;
        }
        this.E = true;
        ChallengesLeaderboardsFragment_GeneratedInjector challengesLeaderboardsFragment_GeneratedInjector = (ChallengesLeaderboardsFragment_GeneratedInjector) a();
        challengesLeaderboardsFragment_GeneratedInjector.getClass();
    }

    @Override // androidx.fragment.app.f
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new ggb.a(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void q() {
        if (this.A == null) {
            this.A = new ggb.a(super.getContext(), this);
            this.B = te4.a(super.getContext());
        }
    }

    @Override // androidx.fragment.app.f
    public final void onAttach(Context context) {
        super.onAttach(context);
        q();
        if (this.E) {
            return;
        }
        this.E = true;
        ChallengesLeaderboardsFragment_GeneratedInjector challengesLeaderboardsFragment_GeneratedInjector = (ChallengesLeaderboardsFragment_GeneratedInjector) a();
        challengesLeaderboardsFragment_GeneratedInjector.getClass();
    }
}
