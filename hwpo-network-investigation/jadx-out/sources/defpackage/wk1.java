package defpackage;

import com.hwpo_training_app.comments.data.network.request.AddCommentRequest;
import com.hwpo_training_app.core.data.model.comment.CommentNetworkEntity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface wk1 {
    @wd2("{entity_path}/{entity_id}/comments/{comment_id}")
    Object a(@eu7(encoded = true, value = "entity_path") String str, @eu7("entity_id") int i, @eu7("comment_id") long j, r02<? super ru8<g2b>> r02Var);

    @ui4("{entity_path}/{entity_id}/comments")
    Object b(@eu7(encoded = true, value = "entity_path") String str, @eu7("entity_id") int i, r02<? super List<CommentNetworkEntity>> r02Var);

    @wn7("{entity_path}/{entity_id}/comments")
    Object c(@eu7(encoded = true, value = "entity_path") String str, @eu7("entity_id") int i, @pr0 AddCommentRequest addCommentRequest, r02<? super CommentNetworkEntity> r02Var);

    @wn7("{entity_path}/{entity_id}/{end_path}")
    Object d(@eu7(encoded = true, value = "entity_path") String str, @eu7(encoded = true, value = "end_path") String str2, @eu7("entity_id") int i, r02<? super g2b> r02Var);
}
