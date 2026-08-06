package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt;
import io.intercom.android.sdk.m5.inbox.reducers.InboxPagingItemsReducerKt;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qf2 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ qf2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() throws IOException {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                xx3 xx3Var = ((xf2) obj).a;
                File canonicalFile = xx3Var.c.invoke().getCanonicalFile();
                synchronized (xx3.e) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = xx3.d;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    absolutePath.getClass();
                    linkedHashSet.add(absolutePath);
                }
                return new ay3(canonicalFile, xx3Var.a, xx3Var.b.invoke(canonicalFile), new wx3(canonicalFile));
            case 1:
                return FinAnswerRowKt.FinAnswerMetadata$lambda$14$lambda$13$lambda$12$lambda$11((h37) obj);
            default:
                return InboxPagingItemsReducerKt.reduceToInboxUiState$lambda$4$lambda$3((a06) obj);
        }
    }
}
