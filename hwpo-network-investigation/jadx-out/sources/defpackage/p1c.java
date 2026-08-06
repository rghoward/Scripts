package defpackage;

import defpackage.p1c;
import defpackage.u1c;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class p1c<MessageType extends u1c<MessageType, BuilderType>, BuilderType extends p1c<MessageType, BuilderType>> extends e0c<MessageType, BuilderType> {
    public final u1c t;
    public u1c u;

    public p1c(MessageType messagetype) {
        this.t = messagetype;
        if (messagetype.k()) {
            z90.a("Default instance must be immutable.");
            throw null;
        }
        this.u = messagetype.m();
    }

    public final void h() {
        if (this.u.k()) {
            return;
        }
        u1c u1cVarM = this.t.m();
        q3c.c.a(u1cVarM.getClass()).c(u1cVarM, this.u);
        this.u = u1cVarM;
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final p1c clone() {
        p1c p1cVar = (p1c) this.t.w(5);
        boolean zK = this.u.k();
        u1c u1cVar = this.u;
        if (zK) {
            u1cVar.n();
            u1cVar = this.u;
        }
        p1cVar.u = u1cVar;
        return p1cVar;
    }

    public final MessageType j() {
        boolean zK = this.u.k();
        MessageType messagetype = (MessageType) this.u;
        if (zK) {
            messagetype.n();
            messagetype = (MessageType) this.u;
        }
        messagetype.getClass();
        if (u1c.u(messagetype, true)) {
            return messagetype;
        }
        throw new b4c();
    }

    public final void l(u1c u1cVar) {
        u1c u1cVar2 = this.t;
        if (u1cVar2.equals(u1cVar)) {
            return;
        }
        if (!this.u.k()) {
            u1c u1cVarM = u1cVar2.m();
            q3c.c.a(u1cVarM.getClass()).c(u1cVarM, this.u);
            this.u = u1cVarM;
        }
        u1c u1cVar3 = this.u;
        q3c.c.a(u1cVar3.getClass()).c(u1cVar3, u1cVar);
    }

    public final void m(byte[] bArr, int i, f1c f1cVar) throws k2c {
        if (!this.u.k()) {
            u1c u1cVarM = this.t.m();
            q3c.c.a(u1cVarM.getClass()).c(u1cVarM, this.u);
            this.u = u1cVarM;
        }
        try {
            q3c.c.a(this.u.getClass()).g(this.u, bArr, 0, i, new i0c(f1cVar));
        } catch (k2c e) {
            throw e;
        } catch (IOException e2) {
            jl.a("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            ao2.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
