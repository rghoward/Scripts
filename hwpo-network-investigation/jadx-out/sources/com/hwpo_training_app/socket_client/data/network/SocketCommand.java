package com.hwpo_training_app.socket_client.data.network;

import defpackage.hl3;
import defpackage.op3;
import defpackage.rd9;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class SocketCommand {
    public static final Companion Companion = new Companion();
    public final String a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<SocketCommand> serializer() {
            return SocketCommand$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SocketCommand(int i, String str, String str2) {
        if (3 != (i & 3)) {
            hl3.b(i, 3, SocketCommand$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocketCommand)) {
            return false;
        }
        SocketCommand socketCommand = (SocketCommand) obj;
        return xj5.a(this.a, socketCommand.a) && xj5.a(this.b, socketCommand.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return op3.a("SocketCommand(command=", this.a, ", identifier=", this.b, ")");
    }

    public SocketCommand() {
        this.a = "subscribe";
        this.b = "{\"channel\":\"MobileNotificationChannel\"}";
    }
}
