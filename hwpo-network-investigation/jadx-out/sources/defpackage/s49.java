package defpackage;

import com.hwpo_training_app.core.data.model.schedule.BenchmarkNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.ProgramSectionNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.SavePerformanceResponse;
import com.hwpo_training_app.core.data.model.schedule.ScheduleDetailsResponse;
import com.hwpo_training_app.core.data.model.schedule.ScheduleResponse;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface s49 {
    @ui4("schedules/{schedule_id}/sections/{section_id}")
    Object a(@eu7("schedule_id") int i, @eu7("section_id") int i2, r02<? super ProgramSectionNetworkEntity> r02Var);

    @ui4("schedules")
    Object b(@gg8(TicketDetailDestinationKt.LAUNCHED_FROM) long j, @gg8("to") long j2, r02<? super ScheduleResponse> r02Var);

    @wd2("schedules/{schedule_id}/sections/{section_id}/complete")
    Object c(@eu7("schedule_id") int i, @eu7("section_id") int i2, r02<? super ru8<g2b>> r02Var);

    @wn7("sections/{section_id}/benchmarks")
    Object d(@eu7("section_id") int i, @pr0 JsonObject jsonObject, r02<? super List<BenchmarkNetworkEntity>> r02Var);

    @ui4("schedules/{schedule_id}/")
    Object e(@eu7("schedule_id") int i, r02<? super ScheduleDetailsResponse> r02Var);

    @wn7("schedules/{schedule_id}/sections/{section_id}/performance")
    Object f(@eu7("schedule_id") int i, @eu7("section_id") int i2, @pr0 qp8 qp8Var, r02<? super SavePerformanceResponse> r02Var);

    @wn7("schedules/{schedule_id}/sections/{section_id}/complete")
    Object g(@eu7("schedule_id") int i, @eu7("section_id") int i2, r02<? super ru8<g2b>> r02Var);

    @wd2("schedules/{schedule_id}/sections/{section_id}/performance")
    Object h(@eu7("schedule_id") int i, @eu7("section_id") int i2, r02<? super ru8<g2b>> r02Var);

    @ui4("athlete/schedules/{date}/plans/{plan_id}")
    Object i(@eu7(AttributeType.DATE) String str, @eu7("plan_id") int i, r02<? super ScheduleDetailsResponse> r02Var);
}
