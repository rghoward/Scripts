package defpackage;

import com.hwpo_training_app.tracking.data.entity.ChallengeEntryDetailsNetworkEntity;
import com.hwpo_training_app.tracking.data.entity.EntryDetailsNetworkEntity;
import com.hwpo_training_app.tracking.data.entity.ScoreInfoNetworkEntity;
import com.hwpo_training_app.tracking.data.entity.TrackedValueEntriesResponse;
import com.hwpo_training_app.tracking.data.entity.TrackedValueResponse;
import com.hwpo_training_app.tracking.data.entity.ValuesToAddResponse;
import io.intercom.android.sdk.models.AttributeType;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface rta {
    @ui4("athlete/challenges/{id}/info")
    Object a(@eu7("id") int i, r02<? super ScoreInfoNetworkEntity> r02Var);

    @ui4("athlete/{value_type}/value/{id}")
    Object b(@eu7("value_type") String str, @eu7("id") int i, r02<? super EntryDetailsNetworkEntity> r02Var);

    @ui4("athlete/{value_type}/{id}/{values_path}")
    Object c(@eu7("value_type") String str, @eu7("id") int i, @eu7("values_path") String str2, @gg8("direction") String str3, @gg8(AttributeType.DATE) String str4, r02<? super TrackedValueEntriesResponse> r02Var);

    @vn7("athlete/{value_type}/value/{id}")
    Object d(@eu7("value_type") String str, @eu7("id") int i, @pr0 qp8 qp8Var, r02<? super ru8<g2b>> r02Var);

    @wn7("athlete/{value_type}/{id}")
    @gd4
    Object e(@eu7("value_type") String str, @eu7("id") int i, @nu3(AttributeType.DATE) String str2, @nu3("units") String str3, @nu3("value") Number number, @nu3("second_value") Number number2, @nu3("note") String str4, @nu3("attachment_ids[]") Long[] lArr, r02<? super ru8<g2b>> r02Var);

    @ui4("athlete/{value_type}")
    Object f(@eu7("value_type") String str, @gg8("page") Integer num, @gg8("per_page") int i, @gg8("q[name_cont]") String str2, r02<? super ValuesToAddResponse> r02Var);

    @ui4("athlete/{value_type}/with_value")
    Object g(@eu7("value_type") String str, @gg8("page") Integer num, @gg8("per_page") int i, @gg8("q[name_cont]") String str2, r02<? super TrackedValueResponse> r02Var);

    @wd2("athlete/{value_type}/{id}/all")
    Object h(@eu7("value_type") String str, @eu7("id") int i, r02<? super ru8<g2b>> r02Var);

    @wd2("athlete/{value_type}/{id}")
    Object i(@eu7("value_type") String str, @eu7("id") int i, r02<? super ru8<g2b>> r02Var);

    @ui4("athlete/challenges/value/{id}")
    Object j(@eu7("id") int i, r02<? super ChallengeEntryDetailsNetworkEntity> r02Var);
}
