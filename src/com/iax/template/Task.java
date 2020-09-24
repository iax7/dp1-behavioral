package com.iax.template;

public abstract class Task {
    private AuditTrail auditTrail;

    protected Task() {
        this.auditTrail = new AuditTrail();
    }

    protected Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();

        doExecute();
    }

    protected abstract void doExecute();
}
