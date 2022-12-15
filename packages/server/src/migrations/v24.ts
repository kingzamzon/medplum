/*
 * Generated by @medplum/generator
 * Do not edit manually.
 */

import { PoolClient } from 'pg';

export async function run(client: PoolClient): Promise<void> {
  await client.query(`ALTER TABLE "ValueSetElement" ADD COLUMN "valueSet" TEXT`);
  await client.query('CREATE INDEX ON "ValueSetElement" ("valueSet")');
}