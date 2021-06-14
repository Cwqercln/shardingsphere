/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.sharding.distsql.parser;

import org.antlr.v4.runtime.CharStream;
import org.apache.shardingsphere.distsql.parser.autogen.ShardingRuleStatementLexer;
import org.apache.shardingsphere.sql.parser.api.parser.SQLLexer;

/**
 * SQL lexer for sharding rule.
 */
public final class ShardingRuleLexer extends ShardingRuleStatementLexer implements SQLLexer {
    
    public ShardingRuleLexer(final CharStream input) {
        super(input);
    }
}