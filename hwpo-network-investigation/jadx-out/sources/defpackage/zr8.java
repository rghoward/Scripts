package defpackage;

import com.hwpo_training_app.reschedule.data.entity.RescheduleMaxDayResponse;
import io.intercom.android.sdk.models.AttributeType;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface zr8 {
    @ui4("schedules/reschedule")
    Object a(@gg8("plan_id") int i, r02<? super RescheduleMaxDayResponse> r02Var);

    @wn7("schedules/reschedule")
    @gd4
    Object b(@nu3("plan_id") int i, @nu3(AttributeType.DATE) String str, @nu3("day_number") int i2, r02<? super ru8<g2b>> r02Var);
}
