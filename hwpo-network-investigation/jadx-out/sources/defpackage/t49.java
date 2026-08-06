package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t49 implements zs3<r49> {
    @Override // defpackage.nf8
    public final Object get() {
        xo5 xo5Var = new xo5();
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            ac4.c("Null flags");
            return null;
        }
        map.put(o98.t, new we0(AudioConstants.TRANSCRIPTION_TIMEOUT_MS, 86400000L, set));
        if (set == null) {
            ac4.c("Null flags");
            return null;
        }
        map.put(o98.v, new we0(1000L, 86400000L, set));
        if (set == null) {
            ac4.c("Null flags");
            return null;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(r49.b.u)));
        if (setUnmodifiableSet == null) {
            ac4.c("Null flags");
            return null;
        }
        map.put(o98.u, new we0(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() >= o98.values().length) {
            new HashMap();
            return new ve0(xo5Var, map);
        }
        aa0.c("Not all priorities have been configured");
        return null;
    }
}
