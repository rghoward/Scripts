package com.hwpo_training_app.leaderboards.details.list.presentation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.t;
import com.hwpo_training_app.leaderboards.databinding.ListItemMyEmptyResultBinding;
import com.hwpo_training_app.leaderboards.databinding.ListItemMyFilledResultBinding;
import com.hwpo_training_app.leaderboards.databinding.ListItemOtherAthleteResultBinding;
import com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter.AdapterDataProvider;
import com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter.AdapterHeaderBinder;
import com.hwpo_training_app.leaderboards.details.list.presentation.adapter.viewholders.BaseAthleteViewHolder;
import com.hwpo_training_app.leaderboards.details.list.presentation.adapter.viewholders.MyEmptyResultViewHolder;
import com.hwpo_training_app.leaderboards.details.list.presentation.adapter.viewholders.MyFilledResultViewHolder;
import com.hwpo_training_app.leaderboards.details.list.presentation.adapter.viewholders.OtherAthleteResultViewHolder;
import com.hwpo_training_app.leaderboards.details.list.presentation.c;
import com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity;
import defpackage.g2b;
import defpackage.ll8;
import defpackage.oh4;
import defpackage.sd1;
import defpackage.u;
import defpackage.xfb;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsAthletesAdapter extends t<AthleteResultUiEntity, BaseAthleteViewHolder<?>> implements AdapterDataProvider, AdapterHeaderBinder {
    public final oh4<AthleteResultUiEntity, g2b> e;
    public final oh4<AthleteResultUiEntity, g2b> f;
    public final c g;
    public final oh4<AthleteResultUiEntity, g2b> h;
    public final oh4<AthleteResultUiEntity.OtherAthleteResultUiEntity, g2b> i;
    public final oh4<Integer, g2b> j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AthleteResultDiffCallback extends m.e<AthleteResultUiEntity> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean a(AthleteResultUiEntity athleteResultUiEntity, AthleteResultUiEntity athleteResultUiEntity2) {
            return athleteResultUiEntity.equals(athleteResultUiEntity2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean b(AthleteResultUiEntity athleteResultUiEntity, AthleteResultUiEntity athleteResultUiEntity2) {
            return athleteResultUiEntity.a() == athleteResultUiEntity2.a();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ViewType {
        public static final ViewType t;
        public static final ViewType u;
        public static final ViewType v;
        public static final /* synthetic */ ViewType[] w;

        static {
            ViewType viewType = new ViewType("OTHER_ATHLETE_RESULT", 0);
            t = viewType;
            ViewType viewType2 = new ViewType("MY_EMPTY_RESULT", 1);
            u = viewType2;
            ViewType viewType3 = new ViewType("MY_FILLED_RESULT", 2);
            v = viewType3;
            w = new ViewType[]{viewType, viewType2, viewType3};
        }

        public ViewType() {
            throw null;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) w.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public LeaderboardDetailsAthletesAdapter(oh4 oh4Var, oh4 oh4Var2, c cVar, oh4 oh4Var3, oh4 oh4Var4, oh4 oh4Var5) {
        super(new AthleteResultDiffCallback());
        this.e = oh4Var;
        this.f = oh4Var2;
        this.g = cVar;
        this.h = oh4Var3;
        this.i = oh4Var4;
        this.j = oh4Var5;
    }

    @Override // com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter.AdapterDataProvider
    public final List<?> c() {
        List list = this.d.f;
        list.getClass();
        return list;
    }

    @Override // com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter.AdapterHeaderBinder
    public final void d(RecyclerView.e0 e0Var, int i) {
        e0Var.getClass();
        Object obj = this.d.f.get(i);
        obj.getClass();
        ((BaseAthleteViewHolder) e0Var).s((AthleteResultUiEntity) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int h(int i) {
        ViewType viewType;
        AthleteResultUiEntity athleteResultUiEntity = (AthleteResultUiEntity) this.d.f.get(i);
        if (athleteResultUiEntity instanceof AthleteResultUiEntity.OtherAthleteResultUiEntity) {
            viewType = ViewType.t;
        } else if (athleteResultUiEntity instanceof AthleteResultUiEntity.MyEmptyResultUiEntity) {
            viewType = ViewType.u;
        } else {
            if (!(athleteResultUiEntity instanceof AthleteResultUiEntity.MyFilledResultUiEntity)) {
                u.b();
                return 0;
            }
            viewType = ViewType.v;
        }
        return viewType.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void j(RecyclerView.e0 e0Var, int i) {
        BaseAthleteViewHolder baseAthleteViewHolder = (BaseAthleteViewHolder) e0Var;
        baseAthleteViewHolder.getClass();
        Object obj = this.d.f.get(i);
        obj.getClass();
        baseAthleteViewHolder.s((AthleteResultUiEntity) obj);
        this.j.invoke(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.e0 l(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int iOrdinal = ViewType.values()[i].ordinal();
        oh4<AthleteResultUiEntity, g2b> oh4Var = this.h;
        oh4<AthleteResultUiEntity, g2b> oh4Var2 = this.f;
        oh4<AthleteResultUiEntity, g2b> oh4Var3 = this.e;
        if (iOrdinal == 0) {
            OtherAthleteResultViewHolder.Companion.getClass();
            oh4Var3.getClass();
            oh4Var2.getClass();
            oh4Var.getClass();
            oh4<AthleteResultUiEntity.OtherAthleteResultUiEntity, g2b> oh4Var4 = this.i;
            oh4Var4.getClass();
            Context context = viewGroup.getContext();
            context.getClass();
            sd1 sd1VarA = ll8.a(ListItemOtherAthleteResultBinding.class);
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            layoutInflaterFrom.getClass();
            return new OtherAthleteResultViewHolder((ListItemOtherAthleteResultBinding) xfb.a(sd1VarA, layoutInflaterFrom, viewGroup, false), oh4Var3, oh4Var2, oh4Var4, oh4Var);
        }
        if (iOrdinal == 1) {
            MyEmptyResultViewHolder.Companion.getClass();
            c cVar = this.g;
            cVar.getClass();
            Context context2 = viewGroup.getContext();
            context2.getClass();
            sd1 sd1VarA2 = ll8.a(ListItemMyEmptyResultBinding.class);
            LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(context2);
            layoutInflaterFrom2.getClass();
            return new MyEmptyResultViewHolder((ListItemMyEmptyResultBinding) xfb.a(sd1VarA2, layoutInflaterFrom2, viewGroup, false), cVar);
        }
        if (iOrdinal != 2) {
            u.b();
            return null;
        }
        MyFilledResultViewHolder.Companion.getClass();
        oh4Var3.getClass();
        oh4Var2.getClass();
        oh4Var.getClass();
        Context context3 = viewGroup.getContext();
        context3.getClass();
        sd1 sd1VarA3 = ll8.a(ListItemMyFilledResultBinding.class);
        LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(context3);
        layoutInflaterFrom3.getClass();
        return new MyFilledResultViewHolder((ListItemMyFilledResultBinding) xfb.a(sd1VarA3, layoutInflaterFrom3, viewGroup, false), oh4Var3, oh4Var2, oh4Var);
    }
}
