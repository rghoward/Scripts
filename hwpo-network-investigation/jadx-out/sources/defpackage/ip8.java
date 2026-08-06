package defpackage;

import io.intercom.android.sdk.models.AttributeType;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface ip8 {
    @wn7("athlete/reports/{score_comment_id}")
    @gd4
    Object a(@eu7("score_comment_id") long j, @nu3("score_id") int i, @nu3("score_value_id") Integer num, @nu3(AttributeType.TEXT) String str, r02<? super ru8<g2b>> r02Var);

    @wn7("athlete/reports/{score_comment_id}")
    @gd4
    Object b(@eu7("score_comment_id") long j, @nu3("score_id") int i, @nu3("score_value_id") Integer num, @nu3("report_type") String str, r02<? super ru8<g2b>> r02Var);
}
