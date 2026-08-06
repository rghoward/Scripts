package defpackage;

import android.content.Context;
import io.intercom.android.sdk.identity.PushTokenStore;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cg8 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ cg8(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return PushTokenStore.pushTokenDataStore_delegate$lambda$4((Context) obj);
            case 1:
                obj.getClass();
                String str = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str);
                if (xj5.a(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new yc6(localeForLanguageTag);
            case 2:
                return g2b.a;
            default:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$13((ru) obj);
        }
    }
}
